package Semestre2.Unidade1Sem2.Lista002.Ex2;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Notebook");
        produto.setPreco(3500.00);
        produto.repor(5);
        System.out.println("Produto: " + produto.getNome() + ", Preço: R$" + produto.getPreco() + ", Estoque: " + produto.getEstoque());

        produto.vender(2);
        System.out.println("Após venda - Estoque: " + produto.getEstoque());

        produto.vender(4);

        produto.repor(3);
        System.out.println("Após reposição - Estoque: " + produto.getEstoque());

        produto.vender(6);
        System.out.println("Após venda - Estoque: " + produto.getEstoque());

        produto.setPreco(-1000);
        System.out.println(produto.getPreco());


    }
}
