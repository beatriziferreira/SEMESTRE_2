package Semestre2.Unidade1Sem2.Lista002.Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ContaBancaria conta1 = new ContaBancaria();
        System.out.print("Digite o nome do titular da conta 1: ");
        conta1.setTitular(scan.nextLine());

        System.out.print("Digite o número da conta 1: ");
        conta1.setNumeroConta(scan.nextLine());

        System.out.println(" ");

        ContaBancaria conta2 = new ContaBancaria();

        System.out.print("Digite o nome do titular da conta 2: ");
        conta2.setTitular(scan.nextLine());

        System.out.print("Digite o número da conta 2: ");
        conta2.setNumeroConta(scan.nextLine());

        System.out.println(" ");

        conta1.depositar(1000.0);
        conta1.depositar(700);

        conta2.depositar(5000);
        conta2.sacar(3000);

        conta2.transferir(conta1, 1800);

        conta1.exibirSaldo();
        conta2.exibirSaldo();

        scan.close();
    }
}
