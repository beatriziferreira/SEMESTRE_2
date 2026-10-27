package RevisaoPosProva.C;

import java.util.ArrayList;

public class Orcamento {
    private Cliente solicitante;
    private Entrega entrega;
    private ArrayList<ItemSetup> itens = new ArrayList<>(5);

    public Orcamento(Cliente solicitante, String cidade, int prazoDias) {
        this.solicitante = solicitante;
        this.entrega = new Entrega(cidade, prazoDias);
    }

    

    public void setSolicitante(Cliente solicitante) {
        if (solicitante == null){
            throw new IllegalArgumentException("Solicitante obrigatório");
        }
        this.solicitante = solicitante;
    }

    public Cliente getSolicitante() {
        return solicitante;
    }

    public String getCidadeEntrega() {
        return entrega.getCidade();
    }

    public int getPrazoEntrega() {
        return entrega.getPrazoDias();
    }

    public ArrayList<ItemSetup> getItens() {
        return itens;
    }

    public void adicionarItem(ItemSetup i){
        if (i == null) {
            throw new IllegalArgumentException("Item inválido");
        }

        if (itens.contains(i)) {
            throw new IllegalStateException("Item já adicionado");
        }

        if (itens.size() >= 5) {
            throw new IllegalStateException("Orçamento lotado");
        }
        itens.add(i);
    }

    public void removerItem(ItemSetup i){
        if (!itens.contains(i)) {
            throw new IllegalStateException("Item não encontrado");
        } 
        itens.remove(i);
    }

    public double calcularValorTotal(){
        double total = 0;
        for (ItemSetup i : itens) {
            total += i.calcularPreco();
        }
        return total;
    }

    public double calcularTotalGarantia(){
        double total = 0;
        for (ItemSetup i : itens) {
            if (i instanceof ComGarantia){
                total += ((ComGarantia) i).calcularGarantiaExtendida(); //Para permitir qualquer objeto que implemente ComGarantia e não apenas Peca.
            }
        }
        return total;
    }

}
