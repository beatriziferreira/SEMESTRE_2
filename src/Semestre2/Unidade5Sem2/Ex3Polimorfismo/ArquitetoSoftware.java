package Semestre2.Unidade5Sem2.Ex3Polimorfismo;

public class ArquitetoSoftware extends Programador {

    @Override 
    public double calcularSalario() {
        double salario = super.calcularSalario();
        double comissao = (getLinguagens().size() * 200);
        return  salario + comissao;
    }
}
