package RevisaoPosProva.A2;

public class Serie extends Midia implements Legendavel{

    private int numTemporadas;

    public Serie(String descricao, double precoBase, int numTemporadas) {
        super(descricao, precoBase);
        this.numTemporadas = numTemporadas;
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() * numTemporadas;
    }

    @Override
    public double calcularPrecoLegenda() {
        return calcularPreco() * 0.1;
    }
    
}
