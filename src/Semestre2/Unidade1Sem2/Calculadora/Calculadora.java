package Semestre2.Unidade1Sem2.Calculadora;

public class Calculadora {

    // Sobrecarga de métodos
    
    public static void somar(int a, int b) {
        int resultado = a + b;
        System.out.println("Resultado da soma: " + resultado);
    }

    public static void somar(int a, int b, int c) {
        int resultado = a + b + c;
        System.out.println("Resultado da soma: " + resultado);


    }
}
