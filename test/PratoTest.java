import Semestre2.Unidade5Sem2.ExRevisão.Prato;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PratoTest {

    @Test
    void tamanhoInvalidoDeveLancarExcecao() {
        assertThrows(IllegalArgumentException.class,
                () -> new Prato("Xis", 30.00, 'X'));
    }

    @Test
    void pratoMedioComDezPorCentoDeDescontoDeveCustar3510() {
        Prato prato = new Prato("Xis Salada", 30.00, 'M');
        prato.calcularPreco(); // tamanho M acrescenta 30%: R$ 39,00
        assertEquals(35.10, prato.calcularPrecoComDesc(10), 0.001);
    }

    @Test
    void descontoAcimaDeCemPorCentoDeveLancarExcecao() {
        Prato prato = new Prato("Xis Salada", 30.00, 'M');
        assertThrows(IllegalArgumentException.class,
                () -> prato.calcularPrecoComDesc(120));
    }
}
