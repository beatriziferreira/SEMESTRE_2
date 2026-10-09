package Semestre2.Unidade5Sem2.ExRevisão;

public class Bebida extends ItensCardapio {
    private int volumeML;
    private boolean alcoolica;
    
    public Bebida(String nome, double precoBase, int volumeML, boolean alcoolica) {
        super(nome, precoBase);
        this.volumeML = volumeML;
        this.alcoolica = alcoolica;

        if (this.volumeML <= 0){
            throw new IllegalArgumentException("O volume deve ser maior que 0.");
        }
    }

    public int getVolumeML() {
        return volumeML;
    }

    public boolean isAlcoolica() {
        return alcoolica;
    }

    @Override
    public double calcularPreco() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
