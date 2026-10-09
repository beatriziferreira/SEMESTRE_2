package Semestre2.Unidade1Sem2.TratamentoExcecoes;

public class Main {
    public static void main(String[] args) {
        Carro[] carros = new Carro[10];
        carros[0] = new Carro("Fusca", "123");
        carros[1] = new Carro("Kombi", "456");

        for (int i = 0; i < carros.length; i++) {
            try {
                System.out.println("Carro " + (i + 1) + ": " + carros[i].getPlaca());
            } catch (NullPointerException e) {
                System.out.println("Vaga disponível");
            }
        }
    }
}
