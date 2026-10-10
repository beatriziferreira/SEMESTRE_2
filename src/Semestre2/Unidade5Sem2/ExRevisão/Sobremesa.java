package Semestre2.Unidade5Sem2.ExRevisão;

public class Sobremesa extends ItensCardapio{
    private int pesoGramas;

    public Sobremesa(String nome, double precoBase, int pesoGramas) {
        super(nome, precoBase);
        this.pesoGramas = pesoGramas;
        if (this.pesoGramas <= 0){
            throw new IllegalArgumentException("O peso deve ser maior que 0.");
        }
    }

    @Override
    public double calcularPreco() {
        double acrescimo = 0;
        if (pesoGramas == 100){
            return getPrecoBase();
        } else {
            acrescimo = getPrecoBase() * pesoGramas / 100; 
            try {
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
        return super.toString() + " [" + pesoGramas + " g]";
    }


    public int getPesoGramas() {
        return pesoGramas;
    }

    


}
