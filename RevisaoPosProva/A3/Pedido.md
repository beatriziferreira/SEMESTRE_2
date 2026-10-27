package RevisaoPosProva.A3;

| Par de classes | Relação | Justificativa |
|---|---|---|
| Gerente e Funcionário | **Herança** | Gerente é um tipo de Funcionário e herda seus atributos e métodos. |
| Carro e Motor | **Composição** | O motor é criado junto com o carro e não existe independentemente dele, conforme o enunciado. |
| Playlist e Música | **Agregação** | A playlist reúne músicas que podem existir independentemente dela. |
| Pedido e Endereço de entrega | **Composição** | O pedido cria e mantém seu endereço de entrega como parte de sua estrutura. |

```java
public class Pedido {
    public class Pedido {
    private ArrayList<ItemCardapio> itens = new ArrayList<>(8);
    private Cliente comprador;
    private Endereco entrega;

    Pedido(Cliente comprador, String rua, int num) {
        this.comprador = comprador;
        this.entrega = new Endereco(rua, num);
        if (this.comprador == null) {
            throw new IllegalArgumentException("Comprador obrigatório");
        }

    }
    }
    // Porque o pedido está extendendo de endereço, o que não deve ser feito pois ambos são objetos com comportamentos distintos

}
```
