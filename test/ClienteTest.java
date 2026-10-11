import Semestre2.Unidade5Sem2.ExRevisão.SaldoInsuficienteException;
import Semestre2.Unidade5Sem2.ExRevisão.Cliente;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void clienteComIdadeNegativaDeveLancarExcecao() {
        assertThrows(IllegalArgumentException.class,
                () -> new Cliente("Ana", "ana@furb.br", -1));
    }

    @Test
    void clienteComEmailInvalidoDeveLancarExcecao() {
        assertThrows(IllegalArgumentException.class,
                () -> new Cliente("Ana", "ana.furb.br", 20));
    }

    @Test
    void clienteIndicadoDeveCreditarDezReaisParaIndicador() {
        Cliente ana = new Cliente("Ana", "ana@furb.br", 25);
        new Cliente("Beto", "beto@furb.br", 22, ana);
        assertEquals(10.00, ana.getSaldoCashback(), 0.001);
    }

    @Test
    void usarCashbackAcimaDoSaldoDeveLancarExcecao() {
        Cliente ana = new Cliente("Ana", "ana@furb.br", 25);
        ana.creditarCashback(10.00);
        assertThrows(SaldoInsuficienteException.class,
                () -> ana.usarCashback(15.00));
    }

    @Test
    void emailsDiferentesApenasPorMaiusculasDevemSerIguais() {
        Cliente ana = new Cliente("Ana", "ana@furb.br", 25);
        Cliente outraAna = new Cliente("Ana", "ANA@FURB.BR", 30);
        assertTrue(ana.equals(outraAna));
    }
}
