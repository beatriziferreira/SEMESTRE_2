package Semestre2.Unidade5Sem2.ExRevisão;

import java.util.ArrayList;

public class Pedido implements Cobravel {
    private ArrayList<ItensCardapio> itens = new ArrayList<>();
    private Cliente cliente;
    static double TAXA_ENTREGA = 7;
    static double FRETE_GRATIS = 100;
    private static int proxNumero = 0;
    private int numero;
    private boolean finalizado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        if (cliente == null) {
            throw new IllegalArgumentException("O cliente não pode ser nulo.");
        }
        numero = (proxNumero++) + 1;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public static int getTotalPedidosCriados() {
        return proxNumero;
    }

    public int getQtdItens() {
        int total = 0;
        for (int i = 0; i < itens.size(); i++) {
            total++;
        }
        return total;
    }

    public double calcularSubtotal() {
        double subtotal = 0;
        for (ItensCardapio item : itens) {
            subtotal += item.getPrecoBase();
        }
        return subtotal;
    }

    public double calcularTaxaEntrega() {
        if (calcularSubtotal() >= FRETE_GRATIS){
            return 0;
        }
        return TAXA_ENTREGA;
    }

    public double calcularValorCobrar() {
        return calcularSubtotal() + calcularTaxaEntrega();
    }

    public boolean finalizar() {
        if (finalizado) {
            throw new IllegalStateException("Pedido já finalizado.");
        } else if (getQtdItens() == 0) {
            throw new IllegalStateException("O pedido está vazio.");
        }
        finalizado = true;
        System.out.println("Pedido finalizado com sucesso!");
        return finalizado;
    }

    public void adicionarItem(ItensCardapio item) {
        if (finalizado) {
            throw new IllegalStateException("Pedido já finalizado.");
        } else if (item == null) {
            throw new IllegalArgumentException("O item não pode ser nulo.");
        } else if (item instanceof Bebida) {
            if (((Bebida) item).isAlcoolica() && cliente.getIdade() < 18) {
                throw new IllegalArgumentException(
                        "Idade mínima permitida para a compra de bebida alcóolica é de 18 anos.");
            }
        }
        itens.add(item);
        System.out.println(item.getNome() + " foi adicionado.");
    }

    public void adicionarItem(ItensCardapio item, int qtd) {
        if (qtd <= 0){
            throw new IllegalArgumentException("A quantidade deve ser de no mínimo 1.");
        }
        for (int i = 0; i < qtd; i++) {
            adicionarItem(item);
        } 
        System.out.println(qtd + " x " + item.getNome() + " foram adicionados no total.");
    }
}
