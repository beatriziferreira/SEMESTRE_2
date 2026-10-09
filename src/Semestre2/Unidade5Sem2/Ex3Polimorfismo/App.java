package Semestre2.Unidade5Sem2.Ex3Polimorfismo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Funcionario g = new Gerente();
        Funcionario c = new Consultor();
        Funcionario p = new Programador();
        Funcionario v = new Vendedor();


        funcionarios.add(g);
        g.setSalario(15000);
        g.setNome("Micael");

        funcionarios.add(c);
        c.setSalario(4500);
        c.setNome("Fabinho");

        funcionarios.add(p);
        p.setSalario(5000);
        p.setNome("Vitória");

        funcionarios.add(v);
        v.setSalario(4000);
        v.setNome("Thaisa");

        ArquitetoSoftware as = new ArquitetoSoftware();
        funcionarios.add(as);
        as.setSalario(7000);
        as.setNome("Beatriz");

        as.adicionarLinguagem("Java");
        as.adicionarLinguagem("Python");

        Funcionario as2 = new ArquitetoSoftware();
        funcionarios.add(as2);
        as2.setSalario(7000);
        as2.setNome("Rafael");


        ((Consultor) c).setViagens(5); // Downcasting
        ((ArquitetoSoftware) as2).adicionarLinguagem("C#"); // Downcasting
        ((Vendedor) v).setQtdVendas(15);

        for (Funcionario func : funcionarios) {
            System.out.println("Salário de " + func.getNome() + ": " + func.calcularSalario());
        }

        for (Funcionario func : funcionarios) {
            if (func instanceof Consultor) {
                System.out.println(func.getNome() + " - " + ((Consultor) func).getViagens() + " viagens");
            }
            if (func instanceof ArquitetoSoftware) {
                System.out.println(func.getNome() + ((ArquitetoSoftware) func).getLinguagens());
            }
            if (func instanceof Vendedor) {
                func.imprimeFuncionario();
            }
        }
    }
}
