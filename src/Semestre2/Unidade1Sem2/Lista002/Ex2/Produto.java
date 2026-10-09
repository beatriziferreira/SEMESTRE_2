package Semestre2.Unidade1Sem2.Lista002.Ex2;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if (preco < 0){
            System.out.println("Preço não pode ser negativo. Valor não alterado.");
        } else {
        this.preco = preco;
        }
    }
    public int getEstoque() {
        return estoque;
    }
    public int vender(int quantidade) {
        if (quantidade <= estoque) {
            estoque -= quantidade;
            return quantidade;
        } else if (quantidade > estoque) {
            System.out.println("Quantidade solicitada não disponível em estoque.");
            return 0;
        } return 0;
    }
    public int repor(int quantidade) {
        estoque += quantidade;
        return estoque;
    }

    
}
