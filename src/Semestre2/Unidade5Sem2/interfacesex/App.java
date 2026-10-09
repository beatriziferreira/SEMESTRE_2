package Semestre2.Unidade5Sem2.interfacesex;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<EmitirSom> objs = new ArrayList<>();

        Cachorro cachorro = new Cachorro();
        Bateria bateria = new Bateria();
        Corvo corvo = new Corvo();

        objs.add(bateria);
        objs.add(cachorro);
        objs.add(corvo);

        for (EmitirSom obj : objs) {
            System.out.println(obj.emitirSom());
            if (obj instanceof Animal) {
                System.out.println(((Animal) obj).qtdPatas());
                if (((Animal) obj).isSelvagem()){
                    System.out.println("É selvagem.");
                }
            }
        }

        EmitirSom emitirSom = corvo;
        System.out.println(emitirSom.emitirSom());

    }
}
