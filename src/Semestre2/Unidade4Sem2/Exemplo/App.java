package Semestre2.Unidade4Sem2.Exemplo;

public class App {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo(78999.99);
        v1.setAno(2020);
        v1.setMarca("Fiat");
        v1.setModelo("Argo");

        System.out.println(v1);

        VeiculoAereo v2 = new VeiculoAereo();
        v2.setAno(2021);
        v2.setMarca("Embraer");
        v2.setModelo("E195-E2");

        System.out.println(v2);

        Carro v3 = new Carro (2022, "Dodge", "Ram 1500", 350000.00);
        System.out.println(v3);

        MotoEletrica v4 = new MotoEletrica(2022, 10000.00);
        System.out.println(v4);
    }
}
