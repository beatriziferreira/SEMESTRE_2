package RevisaoPosProva.C;

public class Montagem extends ItemSetup {
    private int horas;

    public Montagem(String descricao, double precoBase, int horas) {
        if(horas <= 0){
            throw new IllegalArgumentException("Quantidade de horas inválida.");
        } // Forma corrigida
        super(descricao, precoBase);
        this.horas = horas;
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() * horas;
    }

    public int getHoras() {
        return horas;
    }

    
}
