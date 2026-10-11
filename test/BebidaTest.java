import Semestre2.Unidade5Sem2.ExRevisão.Bebida;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BebidaTest {

    @Test
    void choppAlcoolicoDeveAcrescentarTresReais() {
        Bebida chopp = new Bebida("Chopp", 12.00, 500, true);
        assertEquals(15.00, chopp.calcularPreco(), 0.001);
    }
}
