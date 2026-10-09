package Semestre2.Unidade1Sem2.Lista002.Ex3;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
   
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

     public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " para " + numeroConta +" realizado com sucesso.");
            System.out.println(" ");
        } else {
            System.out.println("Valor de depósito inválido. Depósito não realizado.");
            System.out.println(" ");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " para " + numeroConta + " realizado com sucesso.");
            System.out.println(" ");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
            System.out.println(" ");
        } else {
            System.out.println("Valor de saque inválido. Saque não realizado.");
            System.out.println(" ");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para a conta " + contaDestino.getNumeroConta() + " realizada com sucesso.");
            System.out.println(" ");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar a transferência.");
            System.out.println(" ");
        } else {
            System.out.println("Valor de transferência inválido. Transferência não realizada.");
            System.out.println(" ");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println(" ");
    }

    
}
