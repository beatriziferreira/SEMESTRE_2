package Semestre2.Unidade5Sem2.interfacesex;

public interface Animal extends EmitirSom {
    default boolean isSelvagem(){
        return true;
    }

    int qtdPatas();
}
