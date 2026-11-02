import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraDescontoTDDTest {

    @Test
    void deveLancarExcecaoParaValorZerado() {
        // Instanciamos a classe que AINDA NÃO EXISTE!
        CalculadoraDescontoTDD calc = new CalculadoraDescontoTDD();

        assertThrows(IllegalArgumentException.class, () -> {
            calc.calcularValorFinal(0, false);
        });
    }

    @Test
    void deveAplicar20PorcentoDeDescontoParaComprasAcimaDe1000() {
        CalculadoraDescontoTDD calc = new CalculadoraDescontoTDD();

        // Regra: R$ 1500 com 20% de desconto deve resultar em R$ 1200
        assertEquals(1200.0, calc.calcularValorFinal(1500.0, false), 0.01);
    }

    @Test
    void deveAplicar10PorcentoDeDescontoParaComprasEntre500E1000() {
        CalculadoraDescontoTDD calc = new CalculadoraDescontoTDD();

        // Regra: R$ 800 com 10% de desconto deve resultar em R$ 720
        assertEquals(720.0, calc.calcularValorFinal(800.0, false), 0.01);
    }
}