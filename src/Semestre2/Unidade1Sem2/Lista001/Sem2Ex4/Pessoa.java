package Semestre2.Unidade1Sem2.Lista001.Sem2Ex4;
public class Pessoa {
    String nome;
    double peso;
    double altura;

    double calcularImc() {
        return peso / (altura * altura);
    }

    void exibirImc() {
        double imc = calcularImc();
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("IMC: " + String.format("%.2f", imc));
    }

}