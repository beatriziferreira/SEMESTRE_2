# Diferença entre classes abstratas e interfaces em Java

As **classes abstratas e as interfaces** são usadas para trabalhar com abstração e polimorfismo, mas existem diferenças importantes entre elas.

## 1. Classe abstrata (`abstract class`)

Uma classe abstrata funciona como um **modelo para outras classes**. Ela pode ter atributos, construtores, métodos prontos e métodos abstratos, que devem ser implementados pelas classes filhas.

**Exemplo:**

```java
abstract class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void dormir() {
        System.out.println("O animal está dormindo");
    }

    public abstract void emitirSom();
}
```

Agora, uma classe pode herdar esse modelo:

```java
class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}
```

Nesse exemplo:

- `Animal` é abstrata, então não podemos criar diretamente um objeto com `new Animal()`.
- `nome` é um atributo herdado pela classe `Cachorro`.
- `dormir()` já tem uma implementação pronta.
- `emitirSom()` é abstrato e precisa ser implementado pela classe concreta.

## 2. Interface (`interface`)

Uma interface define um **conjunto de comportamentos que uma classe deve oferecer**. É como um contrato: se uma classe implementa uma interface, ela precisa cumprir esse contrato.

**Exemplo:**

```java
interface Nadador {
    void nadar();
}
```

Uma classe implementa essa interface usando `implements`:

```java
class Peixe extends Animal implements Nadador {

    public Peixe(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Glub glub!");
    }

    @Override
    public void nadar() {
        System.out.println("O peixe está nadando");
    }
}
```

Nesse caso, `Peixe` herda de `Animal` e implementa o comportamento definido por `Nadador`.

Uma classe pode implementar **várias interfaces**, mas só pode estender diretamente uma classe. Além disso, interfaces podem ter métodos `default` e `static` com implementação, e métodos `private` auxiliares. Portanto, não contêm apenas métodos abstratos.

## 3. Principais diferenças

| Característica | Classe abstrata | Interface |
|---|---|---|
| Palavra-chave | `abstract class` | `interface` |
| Como usar | `extends` | `implements` |
| Atributos de instância | Sim | Não |
| Construtor | Sim | Não |
| Métodos com implementação | Sim | Sim, com algumas regras |
| Métodos abstratos | Sim | Sim |
| Uma classe pode usar várias? | Estender apenas uma classe | Implementar várias interfaces |
| Objetivo principal | Compartilhar estado e código entre classes relacionadas | Definir comportamentos que diferentes classes devem oferecer |

## 4. Quando usar cada uma?

### Use uma classe abstrata quando...

As classes possuem características em comum e você quer compartilhar atributos e métodos.

**Exemplo:** `Animal`, `Cachorro` e `Gato`. Todos têm nome e podem dormir, mas cada um pode emitir um som diferente.

### Use uma interface quando...

Você quer definir uma capacidade que classes diferentes podem ter, mesmo que não pertençam à mesma hierarquia.

**Exemplo:** `Nadador` pode ser implementada por `Peixe`, `Pessoa` e `Golfinho`, sem que essas classes precisem herdar umas das outras.

## 5. Macete para lembrar na prova

- **Classe abstrata:** representa o que algo *é* e permite compartilhar código. Exemplo: um cachorro **é um** animal.
- **Interface:** representa o que algo *pode fazer*. Exemplo: um peixe **pode** nadar.

Atenção às palavras-chave:

```java
class Cachorro extends Animal { }
class Peixe implements Nadador { }
```

`extends` é usado para herdar de uma classe; `implements` é usado para implementar uma interface.

## 6. Questão para praticar

Imagine que você está criando um sistema Java com as classes `Carro`, `Bicicleta` e `Avião`. Todas podem se deslocar, mas não compartilham os mesmos atributos nem pertencem à mesma categoria de veículo.

**Qual seria a melhor opção para definir o comportamento `deslocar()` que todas devem implementar?**

- **A)** Criar uma classe abstrata `Deslocamento` e obrigar todas a herdarem dela.
- **B)** Criar uma interface `Deslocavel` com o método `deslocar()`.
- **C)** Criar um objeto diferente para cada veículo, sem usar abstração.

**Resposta correta: B.** A interface `Deslocavel` define um comportamento comum sem obrigar as classes a compartilhar uma classe-mãe. Assim, cada veículo implementa `deslocar()` da sua própria maneira.

```java
interface Deslocavel {
    void deslocar();
}
```
