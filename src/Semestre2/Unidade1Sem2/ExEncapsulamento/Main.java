package Semestre2.Unidade1Sem2.ExEncapsulamento;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        
        conta1.setTitular("João");
        conta1.setNumeroConta(12345);
        conta1.depositar(1000);
        conta1.sacar(500);
        
        System.out.println("Saldo: " + conta1.getSaldo());

        conta1.sacar(600); // Tentativa de saque maior que o saldo

        System.out.println("Saldo: " + conta1.getSaldo());

        System.out.println("Número de contas criadas: " + Conta.getContadorContas());

    }
}
