public class CalculadoraDescontoTDD {

    public double calcularValorFinal(double valorTotalItens, boolean isVip) {
        if (valorTotalItens <= 0) {
            throw new IllegalArgumentException("O valor do pedido deve ser maior que zero.");
        }
        if (valorTotalItens > 1000) {
            return valorTotalItens * 0.80;
        }

        if (valorTotalItens > 500) {
            return valorTotalItens * 0.90; // 10% de desconto
        }
        return valorTotalItens;
    }
}