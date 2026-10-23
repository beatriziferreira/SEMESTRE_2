package Prova2;

public class App {
    public static void main(String[] args) {
        Cliente c = new Cliente("Maria", "(99) 91122-3344");
        Pedido p = new Pedido(c, "XV de Novembro", 1200);
        ItemCardapio i1 = new Bebida(1, "Suco de uva", 10, 6);
        ItemCardapio i2 = new Bebida(2, "Água com gás", 5, 2);
        ItemCardapio i3 = new Prato(3, "Risoto de cogumelos", 45, 2);

        p.adicionarItem(i1);
        p.adicionarItem(i2);
        p.adicionarItem(i3);

        System.out.println(p.getItens());

        System.out.println(p.getRuaEntrega() + " - " + p.getComprador().getNome() + " - " + p.getNumeroEntrega());

        System.out.println(p.calcularValorTotal());
        System.out.println(p.calcularTotalImposto());

        try {
            p.adicionarItem(i3);
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println(ItemCardapio.getTotalItens());
    }
}
