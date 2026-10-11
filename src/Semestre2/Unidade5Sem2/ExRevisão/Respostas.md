# Respotas

## 1. Por que proximoNumero é static e numero não é?
Pois proximoNumero vai mostrar a quantidade de pedidos já realizados, e como é um membro da classe, pode ser acessado diretamente pelo "Pedido.proximoNumero" e não precisa inicializar um objeto para acessá-la. Numero vai mostrar o número do pedido, que é um atributo próprio de um objeto já inicializado que recebe o numeroPedido.

## 2. Por que calcularPrecoComDesconto é final e calcularPreco é abstract? Um mesmo método poderia ser as duas coisas?
Pois calcularPrecoComDesconto vai evitar que uma subclasse de ItemCardapio sobrescreva o método e o alterem, pois ele retorna o valor final do item. 
O calcularPreco é um método obrigatório e comum de toda subclasse de ItemCardapio e permite que cada uma sobrescreva o método conforme o que se pede. Não, pois um método final não permite ser sobrescrito, já em um abstract é obrigatório.

## 3. Se a navegação entre Pedido e Cliente fosse bidirecional, o que mudaria na classe Cliente?
A classe Cliente teria que possuir uma lista de pedidos associados a ele, por exemplo, um ArrayList<Pedido>. Assim, seria possível acessar todos os pedidos de um cliente diretamente pela classe Cliente, mantendo a associação nos dois sentidos.

## 4. Por que usarCashback precisa de throws e adicionarItem não precisa, mesmo os dois lançando exceções?
Porque usarCashback lança SaldoInsuficienteException, que é uma exceção verificada (checked exception) e não herda de RuntimeException.
Já adicionarItem lança IllegalArgumentException e IllegalStateException, que são exceções não verificadas (unchecked exceptions), pois herdam de RuntimeException. Portanto, não é obrigatório declarar throws.

