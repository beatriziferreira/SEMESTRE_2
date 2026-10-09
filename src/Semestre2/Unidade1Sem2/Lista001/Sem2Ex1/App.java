package Semestre2.Unidade1Sem2.Lista001.Sem2Ex1;
public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.altura = 1.75;
        pessoa.peso = 78;

        System.out.println("O IMC da pessoa é: " + String.format("%.2f", pessoa.calcularImc()));

    
    }
}
