## B1

```java
    // a) O laço ainda deixa entrar o item 5

    // b) Obtido: o sexto item é adicionado, ficando seis itens na lista.
    //Esperado: o sexto item deve ser recusado, mantendo o limite de cinco.
    
    // c)

    if (itens.size() >= 5) {
    throw new IllegalStateException("Orçamento lotado");
    }
    itens.add(item);

```

## B2

```java
    // a) O tipo de exceção está incorreto, o IllegalArgumentException é utilizado quando o usuário informa um valor inválido (como null ou -1). O correto é utilizar IllegalStateException, que é utilizado quando existe um item repetido.

    // b) Obtido: IllegalArgumentException: Item já incluído no orçamento.
    //Esperado: IllegalStateException: Item já incluído no orçamento.
    
    // c)

    if (itens.contains(item)) {
        throw new IllegalStateException("Item já incluído no orçamento");
}

```

## B3
```java
    // a) A validação de orçamento lotado acontece antes da validação de item repetido. O enunciado exige a ordem: null, repetido e lotado.

    // b) Obtido: IllegalStateException: Orçamento lotado.
    // Esperado: IllegalStateException: Item já incluído no orçamento.

    // c)

    if (item == null) {
    throw new IllegalArgumentException("Item inválido");
}

    if (itens.contains(item)) {
        throw new IllegalStateException("Item já incluído no    orçamento");
    }

    if (itens.size() >= 5) {
        throw new IllegalStateException("Orçamento lotado");
    }

    itens.add(item);

```

## B4
```java
    // a) O método lança uma exceção assim que encontra um item diferente daquele que deseja remover. Além disso, quando a lista está vazia, o for não executa nenhuma vez e a exceção não é lançada.

    //b)
    // Caso 1
    // Obtido: exceção Item não encontrado no orçamento logo na primeira comparação, caso o primeiro item seja diferente do segundo.
    // Esperado: remover o segundo item sem lançar exceção.

    // Caso 2
    // Obtido: nenhuma exceção é lançada.
    // Esperado: IllegalStateException: Item não encontrado no orçamento.


    // c)

    public void removerItem(ItemSetup item) {
    if (!itens.remove(item)) {
        throw new IllegalStateException("Item não encontrado no orçamento");
    }
}
```

## B5
```java
    // a) O contador totalItens é incrementado antes de validar o preço. Quando o construtor lança uma exceção, o código já foi consumido.

    // b) Obtido: os códigos dos itens válidos serão 1 e 3.
    // Esperado: os códigos dos itens válidos serão 1 e 2.

    // c)

   public ItemSetup(String descricao, double precoBase) {
    if (precoBase <= 0) {
        throw new IllegalArgumentException("Preço base inválido");
    }

    totalItens++;
    codigo = totalItens;
    this.descricao = descricao;
    this.precoBase = precoBase;
}

```

## B6
```java
    // a) O método calcula 15% do preço-base multiplicado pela quantidade, ignorando o desconto aplicado ao preço final.

    // b) Preço sem desconto: (1200 * 3 = 3600).
    // Preço com desconto de 10%: (3600 * 0,90 = 3240).
    // Obtido pelo código original: (1200 * 3 * 0,15 = 540).
    // Esperado: 3240 * 0,15 = 486).

    // c)

   @Override
    public double calcularGarantiaEstendida() {
    return calcularPreco() * 0.15;
}

```

## B7
```java
    // a) O nome do método foi escrito como tostring(), com o s minúsculo. Java diferencia letras maiúsculas de minúsculas, portanto esse método não sobrescreve o toString() de Object.

    // b)Obtido: uma representação padrão do objeto.
    // Esperado: 1 - Placa de vídeo - R$ 2500.0.

    // c)

   @Override
    public String toString() {
    return getCodigo() + " - " + getDescricao() + " - R$ " + calcularPreco();
}

```

## B8
```java
    //1.
    // a) O enunciado pede que a variável seja do tipo abstrato ItemSetup, em vez do tipo concreto Peca.

    // b)Obtido: a variável é declarada como Peca.
    // Esperado: 
    ItemSetup placa = new Peca("Placa de vídeo", 2500.0, 1);


    //2.
    // a) Faltou o getNome()

    // b)Obtido: Será exibida uma representação padrão do objeto
    // Esperado: O nome do cliente

    System.out.println("Solicitante: " + orcamento.getSolicitante().getNome());

    //3.
    // a) O enunciado pede que os itens sejam percorridos com for-each, exibindo cada um individualmente.

    // b)Obtido: Os itens serão exibidos juntos, sendo separados por vírgulas.
    // Esperado: 

    for (ItemSetup item : orcamento.getItens()) {
        System.out.println(item);
    }

    //4.
    // a) O código tenta adicionar novamente a mesma peça

    // b)Obtido: IllegalStateException com a mensagem Item já incluído no orçamento. Como não há try/catch, a exceção não é tratada e o programa pode ser interrompido.
    // Esperado: Tratar com try-catch e exibir a mensagem.

    try {
    orcamento.adicionarItem(placa);
    } catch (IllegalStateException e) {
    System.out.println("Erro: " + e.getMessage());
    }
```




