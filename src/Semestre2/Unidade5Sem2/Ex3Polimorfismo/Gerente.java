package Semestre2.Unidade5Sem2.Ex3Polimorfismo;

public class Gerente extends Funcionario {

    private double percentual;

    public double getPercentual() {
        return percentual;
    }
    @Override
    public double calcularSalario() {
        return getSalario() + (getSalario() * percentual);
    } 

    public void imprimeFuncionario(){
        System.out.println(getNome() + " - " + percentual + "%");
    }

}
