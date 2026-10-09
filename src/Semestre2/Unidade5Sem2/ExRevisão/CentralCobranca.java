package Semestre2.Unidade5Sem2.ExRevisão;

import java.util.ArrayList;

public class CentralCobranca {
    private ArrayList<Cobravel> cobraveis = new ArrayList<>();

    public void registrar (Cobravel cobranca){
        if (cobranca == null){
            throw new IllegalArgumentException("A combrança não pode ser nula.");
        }
        cobraveis.add(cobranca);
        System.out.println("Cobrança registrada.");
    }

    public double calcularTotalAReceber(){
        double total = 0;
        for (Cobravel cobravel : cobraveis) {
            total += cobravel.calcularValorCobrar();
        }
       return total; 
    }

    public int getTotalCobrancas(){
        int total = 0;
        for (int i = 0; i < cobraveis.size(); i++) {
            total++;
        }
        return total;
    }

    public String gerarRelatorio(){
        for(Cobravel cobravel : cobraveis){
            cobravel.gerarComporovante();
        };
        return "Total a receber: " + calcularTotalAReceber();
    }


}
