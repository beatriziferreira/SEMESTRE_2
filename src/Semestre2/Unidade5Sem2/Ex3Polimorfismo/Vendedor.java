package Semestre2.Unidade5Sem2.Ex3Polimorfismo;

public class Vendedor extends Funcionario{
    private int qtdVendas;

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public void imprimeFuncionario(){
        System.out.println(getNome() + " - " + getQtdVendas() + " vendas");
    }

    @Override 
    public double calcularSalario() {
        return getSalario() + (getQtdVendas() * 20);
    }


    
}
