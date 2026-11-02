public class CalculadoraDescontoTradicional {

    public double calcularValorFinal(double valorTotalItens, boolean clienteVip) {

        // Regra 1: Pedidos com valor zerado ou negativo lançam exceção
        if (valorTotalItens <= 0) {
            throw new IllegalArgumentException("O valor do pedido não pode ser zerado ou negativo.");
        }

        double valorComDesconto = valorTotalItens;

        // Regra 2 e 3: Descontos por faixa de valor
        if (valorTotalItens > 1000.00) {
            valorComDesconto = valorTotalItens * 0.80; // 20% de desconto
        } else if (valorTotalItens > 500.00) {
            valorComDesconto = valorTotalItens * 0.90; // 10% de desconto
        }

        // Regra 4: Categoria VIP ganha 5% sobre o valor já com desconto
        if (clienteVip) {
            valorComDesconto = valorComDesconto * 0.95;
        }

        // Regra 5: Frete de R$ 15,00 se o valor final for menor que R$ 100,00
        if (valorComDesconto < 100.00) {
            valorComDesconto += 15.00;
        }

        return valorComDesconto;
    }
}