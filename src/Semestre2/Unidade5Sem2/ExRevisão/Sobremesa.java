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
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public int getPesoGramas() {
        return pesoGramas;
    }

    


}
