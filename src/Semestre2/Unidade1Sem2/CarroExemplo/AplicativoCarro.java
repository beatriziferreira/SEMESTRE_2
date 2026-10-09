package Semestre2.Unidade1Sem2.CarroExemplo;

public class AplicativoCarro {

    public static void main(String[] args) {
        
        // Declara o objeto
        Carro carro1;
        // Instância o objeto
        carro1 = new Carro();

        // Declara e instância o objeto
        Carro carro2 = new Carro();

        // Acessa os membros do objeto e atribui valores para o mesmo.
        carro1.marca = "VW";
        carro1.modelo = "Fusca";

        carro2.marca = "BYD";
        carro2.modelo = "Dolphin";

        // Cria uma nova variável de referência e aponta para o mesmo objeto carro1
        Carro carro3 = carro1;

        System.out.println("Modelo do carro 3 " + carro3.modelo);

        System.out.println("Modelo do carro 2:" + carro2.modelo);

        carro1.modelo = "Jetta";

        System.out.println("Modelo do carro 3 " + carro3.modelo);

    }
}
