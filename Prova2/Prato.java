package Prova2;

public class Prato extends ItemCardapio {

    private int quantidade;

    public Prato(int codigo, String descricao, double precoBase, int quantidade) {
        super(codigo, descricao, precoBase);
        this.quantidade = quantidade;
        if (this.quantidade <= 0){
            throw new IllegalArgumentException("Quantidade de pratos inválida");
        }
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() * quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    
    
}
