package Semestre2.Unidade1Sem2.ExEncapsulamento;

public class Conta {
    private String titular;
    private int numeroConta;
    private double Saldo;
    private static int contadorContas;
    
    public Conta() {
        contadorContas++;
    }

    public static int getContadorContas() {
        return contadorContas;
    }

    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        } else {
            Saldo += valor;
        }
    }

    void sacar(double valor) {
        if (valor > Saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            Saldo -= valor;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return Saldo;
    }

}
