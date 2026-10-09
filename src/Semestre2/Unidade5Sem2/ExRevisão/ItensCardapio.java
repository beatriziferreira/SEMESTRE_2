package Semestre2.Unidade5Sem2.ExRevisão;

public abstract class ItensCardapio {
    private String nome;
    private double precoBase;

    public ItensCardapio(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
        if (this.nome == null){
            throw new IllegalArgumentException("O nome não pode ser nulo.");
        }
        if (this.precoBase <= 0){
            throw new IllegalArgumentException("O preço base não pode ser menor ou igual a 0.");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public abstract double calcularPreco();

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    protected void validarPositivo (double precoBase){
        if (this.precoBase <= 0){
            throw new IllegalArgumentException("O preço base não pode ser menor ou igual a 0.");
        }
    }

    public double calcularPrecoComDesc(double percentual){
        final double valorFinal = precoBase - (precoBase / 100 * percentual);
        return valorFinal;
    }

    @Override
    public String toString() {
        return " ";
    }

}
