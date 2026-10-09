# Resumo: Unidade 5

## 1. Polimorfismo

Polimorfismo significa **“muitas formas”**. Em Java, permite que objetos de classes diferentes sejam tratados por um mesmo tipo, mas executem comportamentos específicos de cada classe.

### Exemplo

```java
class Animal {
    public void emitirSom() {
        System.out.println("Som de animal");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}
```

Usando o polimorfismo:

```java
Animal a1 = new Cachorro();
Animal a2 = new Gato();

a1.emitirSom(); // Au au!
a2.emitirSom(); // Miau!
```

Embora as variáveis sejam do tipo `Animal`, cada objeto executa sua própria versão do método `emitirSom()`.

**Para lembrar:** o polimorfismo permite chamar o mesmo método e obter comportamentos diferentes, dependendo do objeto.

### `instanceof`

O operador `instanceof` verifica se um objeto é uma instância de determinada classe ou implementa determinada interface. Ele retorna `true` ou `false`.

```java
Animal animal = new Cachorro();

if (animal instanceof Cachorro) {
    System.out.println("O objeto é um cachorro");
}
```

É útil antes de fazer um downcasting, pois ajuda a verificar se a conversão é válida.

### Downcasting

Downcasting é converter uma referência de um tipo mais geral para um tipo mais específico. Isso pode ser necessário para acessar métodos que existem apenas na classe específica.

```java
Animal animal = new Cachorro();

if (animal instanceof Cachorro) {
    Cachorro cachorro = (Cachorro) animal;
    cachorro.abanarRabo();
}
```

Nesse exemplo, `animal` é uma referência do tipo `Animal`, mas aponta para um objeto `Cachorro`. O downcasting permite acessar o método `abanarRabo()`.

**Atenção:** um downcasting inválido pode causar `ClassCastException`. Por isso, verifique o tipo com `instanceof` antes da conversão, quando houver dúvida. Em versões modernas do Java, também é possível combinar a verificação e a declaração:

```java
if (animal instanceof Cachorro cachorro) {
    cachorro.abanarRabo();
}
```

**Para lembrar:**
- `instanceof`: verifica o tipo real do objeto.
- Downcasting: converte uma referência geral para um tipo mais específico.
- Polimorfismo: permite que objetos diferentes respondam de formas diferentes ao mesmo método.



## 2. Interfaces

Uma interface define um **contrato de comportamentos** que as classes que a implementam devem oferecer. Ela é declarada com `interface` e usada por uma classe com `implements`.

### Exemplo

```java
interface Nadador {
    void nadar();
}

class Peixe implements Nadador {
    @Override
    public void nadar() {
        System.out.println("O peixe está nadando");
    }
}

class Pessoa implements Nadador {
    @Override
    public void nadar() {
        System.out.println("A pessoa está nadando");
    }
}
```

As classes `Peixe` e `Pessoa` implementam o mesmo contrato, mas podem executar o método `nadar()` de maneiras diferentes.

Uma classe pode implementar **várias interfaces**, mas só pode estender diretamente uma classe. Interfaces também podem conter métodos `default` e `static` com implementação.

## 3. Diferença principal

- **Polimorfismo:** permite que um mesmo tipo de referência represente objetos diferentes, que respondem de maneiras específicas.
- **Interface:** define comportamentos que uma classe deve implementar e pode ser usada como tipo de referência para aplicar o polimorfismo.

### Resumo para a prova

Uma interface define *o que uma classe deve fazer*. O polimorfismo permite que diferentes classes implementem ou sobrescrevam comportamentos e sejam utilizadas por meio de um tipo comum.

**Palavras-chave:**
- `interface`: declara uma interface.
- `implements`: indica que uma classe implementa uma interface.
- `@Override`: indica que um método está sobrescrevendo ou implementando um método herdado ou declarado em um tipo.