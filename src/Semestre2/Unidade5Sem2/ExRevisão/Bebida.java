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
        if (isAlcoolica()){
            double acrescimo = getPrecoBase() + 3;
            try{
                setPrecoBase(acrescimo);
                validarPositivo(getPrecoBase());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return getPrecoBase();
    }

    @Override
    public String toString() {
        String alcool = "";
        if (isAlcoolica()){
            alcool = " * ALCOÓLICA";
        }
        return super.toString() + " [" + getVolumeML() + "]" + alcool;
    }


}
