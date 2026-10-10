package Semestre2.Unidade5Sem2.ExRevisão;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CentralCobranca central = new CentralCobranca();

        System.out.println("\n1 =============");        

        ArrayList<ItensCardapio> cardapio = new ArrayList<>();
        ItensCardapio i1 = new Bebida("Chopp", 20.0, 500, true);
        ItensCardapio i2 = new Prato("Feijão, arroz e fritas", 30.0, 'P');
        ItensCardapio i3 = new Sobremesa("Petit gateau", 10.0, 100);

        cardapio.add(i1);
        cardapio.add(i2);
        cardapio.add(i3);

        System.out.println("\n===== CARDÁPIO =====");

        int i = 1;
        for (ItensCardapio item : cardapio) {            
            System.out.println("[" + i + "] - " + item.toString());
            i++;
        }
        System.out.println("\n2 =============");

        Cliente c1 = new Cliente("Ana", "ana@gmail.com", 20);
        Cliente c2 = new Cliente("Beto", "jo@gmail.com", 17, c1);

        System.out.println(c1.getSaldoCashback());
        
        Pedido p2 = new Pedido(c2);

        System.out.println("\n3 =============");

        boolean confirma = false;
        do {
            try {
                System.out.println(c2.getNome() + ", indique a quantidade de pratos que você deseja (mín 1): ");
                int qtdPratos = Integer.parseInt(scan.next());
                p2.adicionarItem(i2, qtdPratos);
                confirma = true;
            } catch (NumberFormatException e) {
                System.out.println("É preciso informar um número inteiro.");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (!confirma);

        System.out.println("\n4 =============");

        try {
            p2.adicionarItem(i1);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        System.out.println("\n5 =============");

        Pedido p = new Pedido(c1);

        try {
            p.adicionarItem(null);
            p.finalizar();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IllegalStateException e){
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            p.adicionarItem(i3);
            p.finalizar();
            System.out.println("Total: R$ " + p.calcularValorCobrar());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IllegalStateException e){
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            p.adicionarItem(i3);
            p.finalizar();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IllegalStateException e){
            System.out.println("Erro: " + e.getMessage());
        }                

        System.out.println("\n6 =============");

        try {
            c1.usarCashback(11);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (SaldoInsuficienteException e){
        } finally {
            System.out.println("Saldo atual de " + c1.getNome() + ": R$ " + c1.getSaldoCashback());
        }

        System.out.println("\n7 =============");

        AssinaturaClube clube = new AssinaturaClube(c1, 6.50, 10);

        central.registrar(p); 
        central.registrar(p2);
        central.registrar(clube);

        System.out.println(" ");

        central.gerarRelatorio();

        scan.close();
    }
}
