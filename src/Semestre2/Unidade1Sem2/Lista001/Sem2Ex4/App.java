package Semestre2.Unidade1Sem2.Lista001.Sem2Ex4;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        Scanner scan = new Scanner(System.in);

        System.out.println("--- Pessoa 1 ---");
        System.out.print("Digite o nome da pessoa 1: ");
        pessoa.nome = scan.next();

        System.out.print("Digite a altura da pessoa 1 (em metros): ");
        pessoa.altura = scan.nextDouble();

        System.out.print("Digite o peso da pessoa 1 (em quilos): ");
        pessoa.peso = scan.nextDouble();

        System.out.println("--- Pessoa 2 ---");
        System.out.print("Digite o nome da pessoa 2: ");
        pessoa2.nome = scan.next();
        System.out.print("Digite a altura da pessoa 2 (em metros): ");
        pessoa2.altura = scan.nextDouble();

        System.out.print("Digite o peso da pessoa 2 (em quilos): ");
        pessoa2.peso = scan.nextDouble();

        System.out.println("--- Pessoa 3 ---");
        System.out.print("Digite o nome da pessoa 3: ");
        pessoa3.nome = scan.next();
        System.out.print("Digite a altura da pessoa 3 (em metros): ");
        pessoa3.altura = scan.nextDouble();

        System.out.print("Digite o peso da pessoa 3 (em quilos): ");
        pessoa3.peso = scan.nextDouble();

        System.out.println("--- Pessoa 3 ---");
        pessoa3.exibirImc();
        System.out.println(" ");
        System.out.println("--- Pessoa 2 ---");
        pessoa2.exibirImc();
        System.out.println(" ");
        System.out.println("--- Pessoa 1 ---");
        pessoa.exibirImc();

        scan.close();
    }
}
