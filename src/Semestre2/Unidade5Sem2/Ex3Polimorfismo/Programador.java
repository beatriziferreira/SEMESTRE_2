package Semestre2.Unidade5Sem2.Ex3Polimorfismo;

import java.util.ArrayList;

public class Programador extends Funcionario {
    private ArrayList<String> linguagens = new ArrayList<>();

    public ArrayList<String> getLinguagens() {
        return linguagens;
    }

    public void adicionarLinguagem(String linguagem) {
        linguagens.add(linguagem);
    }

    @Override
    public void imprimeFuncionario() {
        System.out.println(getNome() + " - " + getLinguagens().toString());
    }

    

    
}
