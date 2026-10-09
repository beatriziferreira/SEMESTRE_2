package Semestre2.Unidade5Sem2.interfacesex;

public class Corvo implements Animal {

    @Override
    public String emitirSom() {
        return "Caw caw";
    }

    @Override
    public int qtdPatas() {
        return 2;
    }

}
