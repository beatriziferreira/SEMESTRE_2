package RevisaoPosProva.C;

public class App {
    public static void main(String[] args) {
        System.out.println("Itens criados: " + ItemSetup.getTotalItens());

        Cliente c1 = new Cliente("Marina Souza", "123.456.789-00");
        Orcamento o1 = new Orcamento(c1, "Blumenau", 7);
        ItemSetup i1 = new Peca("Placa de vídeo", 2500.0, 1);
        ItemSetup i2 = new Peca("Monitor 27 polegadas", 1200.0, 3);
        ItemSetup i3 = new Montagem("Montagem e cabeamento", 80, 2);

        o1.adicionarItem(i1);
        o1.adicionarItem(i2);
        o1.adicionarItem(i3);

        System.out.println("Solicitante: " + o1.getSolicitante().getNome());
        System.out.println("Entrega: " + o1.getCidadeEntrega() + ", em " + o1.getPrazoEntrega() + " dias.");
        for (ItemSetup i : o1.getItens()) {
            System.out.println(i);
        }
        System.out.println("Valor total: R$ " + o1.calcularValorTotal());
        System.out.println("Garantia extendida: R$ " + o1.calcularTotalGarantia());

        try {
            o1.adicionarItem(i1);
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            ItemSetup i4 = new Montagem("Montagem e cabeamento", 80, 0);
            i4.calcularPreco();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Itens criados: " + ItemSetup.getTotalItens());
        // Pois a exceção é lançada após a chamada do construtor da superclasse, que incrementa quando o item passa a verificação, a correção seria validar as horas e depois chamar o super().
        // No item c em A1, a validação ocorre antes de incrementar o contador, e como ela não herda de nenhuma classe, não foi necessário implementar o super() e a contagem ocorre normalmente
    }
}
