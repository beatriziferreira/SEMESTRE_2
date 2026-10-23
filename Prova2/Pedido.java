package Prova2;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemCardapio> itens = new ArrayList<>(8);
    private Cliente comprador;
    private Endereco entrega;

    Pedido(Cliente comprador, String rua, int num) {
        this.comprador = comprador;
        this.entrega = new Endereco(rua, num);
        if (this.comprador == null) {
            throw new IllegalArgumentException("Comprador obrigatório");
        }

    }

    public Cliente getComprador() {
        return comprador;
    }

    public String getRuaEntrega() {
        return entrega.getRua();
    }

    public int getNumeroEntrega() {
        return entrega.getNumero();
    }

    public void setComprador(Cliente comprador) {
        if (this.comprador == null) {
            throw new IllegalArgumentException("Comprador obrigatório");
        }
        this.comprador = comprador;
    }

    public void setEntrega(Endereco entrega) {
        this.entrega = entrega;
    }

    public ArrayList<ItemCardapio> getItens() {
        return itens;
    }

    public void adicionarItem(ItemCardapio i) {
        if (i == null) {
            throw new IllegalArgumentException("Item inválido");
        }

        if (itens.contains(i)) {
            throw new IllegalStateException("Item já adicionado");
        }

        if (itens.size() >= 8) {
            throw new IllegalStateException("Pedido lotado");
        }
        itens.add(i);
        System.out.println("Item adicionado");
    }

    public void removerItem(ItemCardapio i) {
        if (!itens.contains(i)) {
            throw new IllegalStateException("Item não encontrado");
        } 
        itens.remove(i);
    }

    public double calcularTotalImposto() {
        double total = 0;
        for (ItemCardapio ic : itens) {
            if (ic instanceof Tributavel){
                total += ((Tributavel)ic).calcularImposto();
            }
        }
        return total;
    }

    public double calcularValorTotal() {
        double total = 0;
        for (ItemCardapio ic : itens) {
            total += ic.calcularPreco();
        }
        return total;
    }

}
