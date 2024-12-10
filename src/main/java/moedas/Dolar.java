package moedas;

public class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public double converterParaReais() {
        double taxaDeConversao = 5.0; // Exemplo: 1 Dólar = 5 Reais
        return valor * taxaDeConversao;
    }

    @Override
    public String toString() {
        return "Dólar: " + valor;
    }

    @Override
    public String informacoes() {
        return "Dólar com valor: " + valor;
    }
}
