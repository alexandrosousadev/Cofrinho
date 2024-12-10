package cofrinho;

import moedas.Moeda;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();

    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
    }

    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("Nenhuma moeda cadastrada.");
        } else {
            for (Moeda moeda : listaMoedas) {
                System.out.println(moeda.informacoes());
            }
        }
    }

    public double calcularTotalEmReais() {
        double total = 0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converterParaReais();
        }
        return total;
    }
}
