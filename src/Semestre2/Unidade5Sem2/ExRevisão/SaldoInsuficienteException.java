package Semestre2.Unidade5Sem2.ExRevisão;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException (double saldo, double valorSolicitado){
        double total = saldo - valorSolicitado;
        if (total <= 0) {
            System.out.println("Saldo insuficiente.");
        }
    }
}

