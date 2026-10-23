package Prova2;

public abstract class ItemCardapio {
    public static int totalItens;
    private int codigo;
    private String descricao;
    private double precoBase;

    public ItemCardapio(int codigo, String descricao, double precoBase) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoBase = precoBase;

        if (this.precoBase <= 0){
            throw new IllegalArgumentException("Preço base inválido");
        }

        totalItens++;
    }

    public static int getTotalItens() {
        return totalItens;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public abstract double calcularPreco();

    @Override 
    public String toString(){
        return codigo + " - " + descricao + " - R$ " + calcularPreco();
    }
    
    
}
