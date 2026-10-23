package RevisaoPosProva.A2;

public class Documentario extends Midia implements Legendavel{

    public Documentario(String descricao, double precoBase) {
        super(descricao, precoBase);
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase();
    }

    @Override
    public double calcularPrecoLegenda() {
        return getPrecoBase() * 0.1;
    }

    
}
