public class CalculadoraDescontoTDD {

    public double calcularValorFinal(double valorTotalItens, boolean isVip) {
        if (valorTotalItens <= 0) {
            throw new IllegalArgumentException("O valor do pedido deve ser maior que zero.");
        }
        if (valorTotalItens > 1000) {
            return valorTotalItens * 0.80;
        }
        return valorTotalItens;
    }
}