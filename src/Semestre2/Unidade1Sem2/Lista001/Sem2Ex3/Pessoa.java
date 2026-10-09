package Semestre2.Unidade1Sem2.Lista001.Sem2Ex3;
public class Pessoa {
    double peso;
    double altura;

    double calcularImc() {
        return peso / (altura * altura);
    }

}