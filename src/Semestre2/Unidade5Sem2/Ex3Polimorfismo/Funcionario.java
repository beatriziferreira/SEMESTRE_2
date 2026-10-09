package Semestre2.Unidade5Sem2.Ex3Polimorfismo;

public abstract class Funcionario {
    private String nome;
    private double salario;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }
    public abstract void imprimeFuncionario();

    
}
