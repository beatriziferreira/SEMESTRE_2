package Semestre2.Unidade5Sem2.ExRevisão;

public abstract class ItensCardapio {
    private String nome;
    private double precoBase;
    private double valorFinal;

    public ItensCardapio(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
        if (this.nome == null){
            throw new IllegalArgumentException("O nome não pode ser nulo.");
        }
        if (this.precoBase <= 0){
            throw new IllegalArgumentException("O preço base não pode ser menor ou igual a 0.");
        }
        valorFinal = this.precoBase;
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

    public final double calcularPrecoComDesc(double percentual){
        if (percentual < 0 || percentual > 100){
            throw new IllegalArgumentException("Valor de desconto deve ser entre 0 e 100");
        }
        valorFinal = precoBase - (precoBase / 100 * percentual);
        setPrecoBase(valorFinal);
        return precoBase;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + precoBase;
    }

}
