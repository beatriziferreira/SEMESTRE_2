package Semestre2.Unidade1Sem2.Lista001.Sem2Ex3;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner scan = new Scanner(System.in);

        System.out.println("--- Pessoa 1 ---");
        System.out.print("Digite a altura da pessoa 1 (em metros): ");
        pessoa.altura = scan.nextDouble();

        System.out.print("Digite o peso da pessoa 1 (em quilos): ");
        pessoa.peso = scan.nextDouble();

        
        System.out.println("O IMC da pessoa 1 é: " + String.format("%.2f", pessoa.calcularImc()));

        System.out.println("--- Pessoa 2 ---");
        System.out.print("Digite a altura da pessoa 2 (em metros): ");
        pessoa.altura = scan.nextDouble();

        System.out.print("Digite o peso da pessoa 2 (em quilos): ");
        pessoa.peso = scan.nextDouble();


        System.out.println("O IMC da pessoa 2 é: " + String.format("%.2f", pessoa.calcularImc()));

        System.out.println("--- Pessoa 3 ---");
        System.out.print("Digite a altura da pessoa 3 (em metros): ");
        pessoa.altura = scan.nextDouble();

        System.out.print("Digite o peso da pessoa 3 (em quilos): ");
        pessoa.peso = scan.nextDouble();


        System.out.println("O IMC da pessoa 3 é: " + String.format("%.2f", pessoa.calcularImc()));

        scan.close();
    }
}
