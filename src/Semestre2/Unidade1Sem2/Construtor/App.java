package Semestre2.Unidade1Sem2.Construtor;

public class App {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Gol", 2015, "Branco");
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAno());
        System.out.println(carro1.getCor());

        Carro carro2 = new Carro();
        carro2.setModelo("Civic");
        carro2.setAno(2020);
        carro2.setCor("Preto");
        carro2.setMarca("Honda");
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getAno());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getMarca());

        Carro carro3 = new Carro("Corolla", 2021, "Prata", "Toyota");
        System.out.println(carro3.getModelo());
        System.out.println(carro3.getAno());
        System.out.println(carro3.getCor());
        System.out.println(carro3.getMarca());
    }
}
