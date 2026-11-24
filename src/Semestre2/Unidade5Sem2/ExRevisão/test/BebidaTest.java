import Semestre2.Unidade5Sem2.ExRevisão.Bebida;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BebidaTest {

    @Test
    void choppAlcoolicoDeveAcrescentarTresReais() {
        Bebida chopp = new Bebida("Chopp", 12.00, 500, true);
        assertEquals(15.00, chopp.calcularPreco(), 0.001);
    }

    @Test
    void bebidaComVolumeZeroDeveLancarExcecao() {
        assertThrows(IllegalArgumentException.class,
                () -> new Bebida("Refri", 6.00, 0, false));
    }

    @Test
    void bebidaNaoAlcoolicaDeveManterPrecoBase() {
        Bebida refri = new Bebida("Refri", 6.00, 350, false);

        assertEquals(6.00, refri.calcularPreco(), 0.001);
    }
}
