package Semestre2.Unidade1Sem2.Lista001.Sem2Ex2;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a sua altura (em metros): ");
        pessoa.altura = scan.nextDouble();

        System.out.print("Digite o seu peso (em quilos): ");
        pessoa.peso = scan.nextDouble();

        System.out.println("O seu IMC é: " + String.format("%.2f", pessoa.calcularImc()));

        scan.close();
    }
}
