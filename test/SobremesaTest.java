import Semestre2.Unidade5Sem2.ExRevisão.Sobremesa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SobremesaTest {

    @Test
    void pudimDeCentoECinquentaGramasDeveCustarDozeReais() {
        Sobremesa pudim = new Sobremesa("Pudim", 8.00, 150);
        assertEquals(12.00, pudim.calcularPreco(), 0.001);
    }
}
