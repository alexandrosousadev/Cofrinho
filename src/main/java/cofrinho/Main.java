package cofrinho;

import cofrinho.Cofrinho;
import moedas.Dolar;
import moedas.Euro;
import moedas.Real;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        int opcao;

        do {
            // Menu
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Listar moedas");
            System.out.println("3 - Calcular valor total em Reais");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Adicionar moeda
                    System.out.println("Escolha a moeda:");
                    System.out.println("1 - Dólar");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Real");
                    int tipoMoeda = scanner.nextInt();
                    System.out.print("Informe o valor: ");
                    double valor = scanner.nextDouble();

                    switch (tipoMoeda) {
                        case 1: cofrinho.adicionar(new Dolar(valor)); break;
                        case 2: cofrinho.adicionar(new Euro(valor)); break;
                        case 3: cofrinho.adicionar(new Real(valor)); break;
                        default: System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    // Listar moedas
                    cofrinho.listagemMoedas();
                    break;

                case 3:
                    // Calcular valor total em Reais
                    System.out.println("Total convertido em Reais: " + cofrinho.calcularTotalEmReais());
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
