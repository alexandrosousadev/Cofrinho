package moedas;

public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public double converterParaReais() {
        return valor;
    }

    @Override
    public String toString() {
        return "Real: " + valor;
    }

    @Override
    public String informacoes() {
        return "Real com valor: " + valor;
    }
}
