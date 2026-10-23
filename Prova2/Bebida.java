package Prova2;

public class Bebida extends ItemCardapio implements Tributavel {

    private int unidades;

    public Bebida(int codigo, String descricao, double precoBase, int unidades) {
        super(codigo, descricao, precoBase);
        this.unidades = unidades;
        if (this.unidades <= 0){
            throw new IllegalArgumentException("Quantidade de unidades inválida");
        }
    }

    @Override
    public double calcularImposto() {
        return calcularPreco() * 0.12;
    }

    @Override
    public double calcularPreco() {
        if (unidades >= 6){
            return getPrecoBase() * unidades - (getPrecoBase() * unidades * 0.15);
        }
        return getPrecoBase() * unidades;
    }

    public int getUnidades() {
        return unidades;
    }

    

}
