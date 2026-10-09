package Semestre2.Unidade5Sem2.ExRevisão;

public class Prato extends ItensCardapio {
    private char tamanho;

    public Prato(String nome, double precoBase, char tamanho) {
        super(nome, precoBase);
        this.tamanho = tamanho;
        if (this.tamanho != 'P'|| this.tamanho != 'p' || this.tamanho != 'M'|| this.tamanho != 'm' || this.tamanho != 'G'|| this.tamanho != 'g'){
            throw new IllegalArgumentException("O tamanho deve ser P, M ou G");
        }
    }

    public char getTamanho() {
        return tamanho;
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
