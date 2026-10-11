import Semestre2.Unidade5Sem2.ExRevisão.Bebida;
import Semestre2.Unidade5Sem2.ExRevisão.Cliente;
import Semestre2.Unidade5Sem2.ExRevisão.Prato;
import Semestre2.Unidade5Sem2.ExRevisão.Pedido;
import Semestre2.Unidade5Sem2.ExRevisão.AssinaturaClube;
import Semestre2.Unidade5Sem2.ExRevisão.CentralCobranca;
import Semestre2.Unidade5Sem2.ExRevisão.Sobremesa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CentralCobrancaTest {

    @Test
    void pedidoEAssinaturaDevemSomar26698() {
        Cliente cliente = new Cliente("Ana", "ana@furb.br", 25);
        Prato xis = new Prato("Xis Salada", 30.00, 'M');
        Bebida refri = new Bebida("Refri", 6.00, 350, false);
        Sobremesa pudim = new Sobremesa("Pudim", 8.00, 150);
        xis.calcularPreco();
        refri.calcularPreco();
        pudim.calcularPreco();

        Pedido pedido = new Pedido(cliente);
        pedido.adicionarItem(xis);
        pedido.adicionarItem(refri);
        pedido.adicionarItem(pudim);

        AssinaturaClube assinatura = new AssinaturaClube(cliente, 19.90, 12);
        CentralCobranca central = new CentralCobranca();
        central.registrar(pedido);
        central.registrar(assinatura);

        assertEquals(266.98, central.calcularTotalAReceber(), 0.001);
    }
}
