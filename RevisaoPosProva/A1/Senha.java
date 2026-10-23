package RevisaoPosProva.A1;

public class Senha {
    private int numero;
    private String setor;
    private static int totalEmitidas;

    public Senha(String setor) {
        this.setor = setor;
        if (this.setor == null){
            throw new IllegalArgumentException("Setor obrigatório.");
        }
        totalEmitidas++;
        numero = totalEmitidas;
    }

    public int getNumero() {
        return numero;
    }

    public String getSetor() {
        return setor;
    }

    public static int getTotalEmitidas() {
        return totalEmitidas;
    }

    @Override 
    public String toString(){
        return numero + " - " + setor;
    }


}
