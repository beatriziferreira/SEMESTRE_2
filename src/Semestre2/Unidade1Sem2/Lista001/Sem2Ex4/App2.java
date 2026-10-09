package Semestre2.Unidade1Sem2.Lista001.Sem2Ex4;
import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[3];
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa(); //Cria um novo objeto Pessoa para cada posição do array
            System.out.println("--- Pessoa " + (i + 1) + " ---");
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            pessoas[i].nome = scan.next();
            System.out.print("Digite a altura da pessoa " + (i + 1) + " (em metros): ");
            pessoas[i].altura = scan.nextDouble();
            System.out.print("Digite o peso da pessoa " + (i + 1) + " (em quilos): ");
            pessoas[i].peso = scan.nextDouble();
        }
        for (int i = pessoas.length - 1; i >= 0; i--) {
            System.out.println("--- Pessoa " + (i + 1) + " ---");
            pessoas[i].exibirImc();
            System.out.println(" ");
        }
        scan.close();
    }
}
