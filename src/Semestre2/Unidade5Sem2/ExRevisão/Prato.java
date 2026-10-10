package Semestre2.Unidade5Sem2.ExRevisão;

public class Prato extends ItensCardapio {
    private char tamanho;

    public Prato(String nome, double precoBase, char tamanho) {
        super(nome, precoBase);
        this.tamanho = tamanho;
        if (this.tamanho != 'P' && this.tamanho != 'p' && this.tamanho != 'M'&& this.tamanho != 'm' && this.tamanho != 'G'&& this.tamanho != 'g'){
            throw new IllegalArgumentException("O tamanho deve ser P, M ou G");
        }
    }

    public char getTamanho() {
        return tamanho;
    }

    @Override
    public double calcularPreco() {
        if (tamanho == 'p' || tamanho == 'P'){
            return getPrecoBase();
        } else if (tamanho == 'm' || tamanho == 'M'){
            double aumento = getPrecoBase() + (getPrecoBase() / 100 * 30);
            try {
                setPrecoBase(aumento);
                validarPositivo(getPrecoBase());
            } catch (IllegalArgumentException e){
                System.out.println("Erro: " + e.getMessage());
            }
            return getPrecoBase();
        } else if (tamanho == 'g' || tamanho == 'G'){
            double aumento = getPrecoBase() + (getPrecoBase() / 100 * 60);
           try {
                setPrecoBase(aumento);
                validarPositivo(getPrecoBase());
            } catch (IllegalArgumentException e){
                System.out.println("Erro: " + e.getMessage());
            }
            
        } return getPrecoBase();
    }

    @Override
    public String toString() {
        return super.toString() + " [" + getTamanho() + "]";
    }
    
    
}
