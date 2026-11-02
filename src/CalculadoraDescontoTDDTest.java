import org.junit.jupiter.api.Test;
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
}