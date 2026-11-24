import Semestre2.Unidade5Sem2.ExRevisão.Bebida;
import Semestre2.Unidade5Sem2.ExRevisão.Cliente;
import Semestre2.Unidade5Sem2.ExRevisão.Prato;
import Semestre2.Unidade5Sem2.ExRevisão.Pedido;
import Semestre2.Unidade5Sem2.ExRevisão.Sobremesa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void pedidoComXisRefriEPudimDeveTerSubtotal57ETotal64() {
        Cliente cliente = new Cliente("Ana", "ana@furb.br", 25);
        Prato xis = new Prato("Xis Salada", 30.00, 'M');
        Bebida refri = new Bebida("Refri", 6.00, 350, false);
        Sobremesa pudim = new Sobremesa("Pudim", 8.00, 150);

        xis.setPrecoBase(xis.calcularPreco());
        refri.setPrecoBase(xis.calcularPreco());
        pudim.setPrecoBase(xis.calcularPreco());

        Pedido pedido = new Pedido(cliente);
        pedido.adicionarItem(xis);
        pedido.adicionarItem(refri);
        pedido.adicionarItem(pudim);

        assertEquals(57.00, pedido.calcularSubtotal(), 0.001);
        assertEquals(7.00, pedido.calcularTaxaEntrega(), 0.001);
        assertEquals(64.00, pedido.calcularValorCobrar(), 0.001);
    }

    @Test
    void doisXisGrandesDeQuarentaReaisDevemTerFreteGratis() {
        Cliente cliente = new Cliente("Ana", "ana@furb.br", 25);
        Prato xis = new Prato("Xis", 40.00, 'G');
        xis.setPrecoBase(xis.calcularPreco());

        Pedido pedido = new Pedido(cliente);
        pedido.adicionarItem(xis, 2);

        assertEquals(128.00, pedido.calcularSubtotal(), 0.001);
        assertEquals(0.00, pedido.calcularTaxaEntrega(), 0.001);
        assertEquals(128.00, pedido.calcularValorCobrar(), 0.001);
    }

    @Test
    void menorDeIdadeNaoPodeAdicionarChopp() {
        Cliente cliente = new Cliente("Beto", "beto@furb.br", 17);
        Pedido pedido = new Pedido(cliente);
        Bebida chopp = new Bebida("Chopp", 12.00, 500, true);

        assertThrows(IllegalArgumentException.class,
                () -> pedido.adicionarItem(chopp));
    }

    @Test
    void quantidadeZeroDeveLancarExcecao() {
        Cliente cliente = new Cliente("Ana", "ana@furb.br", 25);
        Pedido pedido = new Pedido(cliente);
        Prato xis = new Prato("Xis", 30.00, 'M');

        assertThrows(IllegalArgumentException.class,
                () -> pedido.adicionarItem(xis, 0));
    }

    @Test
    void finalizarPedidoVazioDeveLancarExcecao() {
        Cliente cliente = new Cliente("Ana", "ana@furb.br", 25);
        Pedido pedido = new Pedido(cliente);

        assertThrows(IllegalStateException.class, pedido::finalizar);
    }

    @Test
    void finalizarPedidoComSubtotal57DeveCreditarCashback285() {
        Cliente cliente = new Cliente("Ana", "ana@furb.br", 25);
        Prato xis = new Prato("Xis Salada", 30.00, 'M');
        Bebida refri = new Bebida("Refri", 6.00, 350, false);
        Sobremesa pudim = new Sobremesa("Pudim", 8.00, 150);
        xis.setPrecoBase(xis.calcularPreco());
        refri.setPrecoBase(xis.calcularPreco());
        pudim.setPrecoBase(xis.calcularPreco());

        Pedido pedido = new Pedido(cliente);
        pedido.adicionarItem(xis);
        pedido.adicionarItem(refri);
        pedido.adicionarItem(pudim);
        pedido.finalizar();

        assertEquals(2.85, cliente.getSaldoCashback(), 0.001);
    }

    @Test
    void pedidosCriadosEmSequenciaDevemTerNumerosConsecutivos() {
        Cliente cliente = new Cliente("Ana", "ana@furb.br", 25);
        Pedido primeiro = new Pedido(cliente);
        Pedido segundo = new Pedido(cliente);

        assertEquals(primeiro.getNumero() + 1, segundo.getNumero());
    }

    @Test
    void adicionarItemNuloDeveLancarExcecao() {
        Cliente ana = new Cliente("Ana", "ana@furb.br", 25);
        Pedido pedido = new Pedido(ana);

        assertThrows(IllegalArgumentException.class,
                () -> pedido.adicionarItem(null));
    }

    @Test
    void adicionarItemDepoisDeFinalizarDeveLancarExcecao() {
        Cliente ana = new Cliente("Ana", "ana@furb.br", 25);
        Pedido pedido = new Pedido(ana);

        pedido.adicionarItem(new Prato("Xis", 30.00, 'P'));
        pedido.finalizar();

        assertThrows(IllegalStateException.class,
                () -> pedido.adicionarItem(
                        new Prato("Pizza", 40.00, 'M')));
    }
}
