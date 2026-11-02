import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDescontoTradicionalTest {

    CalculadoraDescontoTradicional calc = new CalculadoraDescontoTradicional();

    @Test
    void deveLancarExcecaoParaValorZeradoOuNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.calcularValorFinal(0, false);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            calc.calcularValorFinal(-10, false);
        });
    }

    @Test
    void deveAplicar20PorcentoDeDescontoParaComprasAcimaDe1000() {
        // Regra: > 1000 = 20% desconto (1500 - 20% = 1200)
        assertEquals(1200.0, calc.calcularValorFinal(1500.0, false), 0.01);
    }

    @Test
    void deveAplicar10PorcentoDeDescontoParaComprasAcimaDe500() {
        // Regra: > 500 e <= 1000 = 10% desconto (600 - 10% = 540)
        assertEquals(540.0, calc.calcularValorFinal(600.0, false), 0.01);
    }

    @Test
    void deveAplicarDescontoVipAdicionalDe5Porcento() {
        // Regra VIP: 1500 - 20% = 1200 -> 1200 - 5% = 1140
        assertEquals(1140.0, calc.calcularValorFinal(1500.0, true), 0.01);
    }

    @Test
    void deveCobrarFreteSeValorFinalForMenorQue100() {
        // Regra: 50 (sem desconto) + 15 de frete = 65
        assertEquals(65.0, calc.calcularValorFinal(50.0, false), 0.01);
    }
}