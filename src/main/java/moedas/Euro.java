package moedas;

public class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public double converterParaReais() {
        double taxaDeConversao = 5.5; // Exemplo: 1 Euro = 5.5 Reais
        return valor * taxaDeConversao;
    }

    @Override
    public String toString() {
        return "Euro: " + valor;
    }

    @Override
    public String informacoes() {
        return "Euro com valor: " + valor;
    }
}
