package Semestre2.Unidade5Sem2.interfacesex;

public class Cachorro implements Animal{

    @Override
    public String emitirSom() {
        return "Au au";
    }

    @Override
    public int qtdPatas() {
        return 4;
    }

    @Override 
    public boolean isSelvagem(){
        return false;
    }
   
}
