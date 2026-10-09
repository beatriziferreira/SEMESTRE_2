package Semestre2.Unidade5Sem2.ExRevisão;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(double saldo, double valorSolicitado) {
        System.out.println("Saldo insuficiente: disponível R$" + saldo + ", solicitado R$ " + valorSolicitado);
    }
}
