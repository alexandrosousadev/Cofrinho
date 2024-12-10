package moedas;

public abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract double converterParaReais(); //  retorna o valor convertido para Reais.

    public abstract String informacoes(); // Informações da moeda (nome e valor).

    public double pegarValor() {
        return valor;
    }
}
