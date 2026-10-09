package Semestre2.Unidade1Sem2.Lista001.Sem2Ex2;
public class Pessoa {
    double peso;
    double altura;

    double calcularImc() {
        return peso / (altura * altura);
    }

}