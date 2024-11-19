package application;

import entities.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instanciação do objeto do tipo Cofrinho (onde será uma lista)
        Cofrinho cofre = new Cofrinho();

        // Menu mostrado a primeira vez para a escolha desejada
        System.out.println("------- Cofrinho - Nicole Volcian Ascencao -------");
        System.out.println("1 - Adicionar moeda");
        System.out.println("2 - Remover moeda");
        System.out.println("3 - Listar moedas");
        System.out.println("4 - Total convertido (R$)");
        System.out.println("5 - Sair");
        System.out.print("Digite a opção desejada: ");
        int opcao = sc.nextInt();
        System.out.println();

        // Criação de variáveis e objeto
        int tipoMoeda;
        double valor;
        Moeda moeda;

        // Estrutura de repetição criada para que o menu se repita até que seja digitado 5 (sair)
        while(opcao != 5){
            // Estrutura de decisão para que sejam feitas as instruções de acordo com a opção desejada
            switch (opcao) {
                case 1 -> {
                    tipoMoeda = 0;
                    while (tipoMoeda > 3 || tipoMoeda <= 0) {
                        System.out.println("1 - Dolar");
                        System.out.println("2 - Euro");
                        System.out.println("3 - Real");
                        System.out.print("Informe a moeda: ");
                        tipoMoeda = sc.nextInt();
                        System.out.println();
                    }
                    System.out.print("Valor: ");
                    valor = sc.nextDouble();
                    System.out.println();
                    // Estrutura de decisão para que o objeto seja instanciado com seu tipo
                    if (tipoMoeda == 1) {
                        moeda = new Dolar(valor);
                    } else if (tipoMoeda == 2) {
                        moeda = new Euro(valor);
                    } else {
                        moeda = new Real(valor);
                    }
                    // Com o objeto já instanciado, é chamado o metodo de adicionar a moeda
                    cofre.adicionar(moeda);
                }
                case 2 -> {
                    tipoMoeda = 0;
                    while (tipoMoeda > 3 || tipoMoeda <= 0) {
                        System.out.println("1 - Dolar");
                        System.out.println("2 - Euro");
                        System.out.println("3 - Real");
                        System.out.print("Informe a moeda: ");
                        tipoMoeda = sc.nextInt();
                        System.out.println();
                    }
                    System.out.print("Valor: ");
                    valor = sc.nextDouble();
                    System.out.println();
                    // Estrutura de decisão para que o objeto seja instanciado com seu tipo
                    if (tipoMoeda == 1) {
                        moeda = new Dolar(valor);
                    } else if (tipoMoeda == 2) {
                        moeda = new Euro(valor);
                    } else {
                        moeda = new Real(valor);
                    }
                    // Com o objeto já instanciado, é chamado o metodo de remover a moeda
                    cofre.remover(moeda);
                }
                // Chamada para o metodo de listar moedas
                case 3 -> cofre.listagemMoedas();
                // Chamada para o metodo de mostrar valor total convertido
                case 4 -> System.out.println(cofre.totalConvertido());
                default -> System.out.println("Opção inválida.");
            }

            // Menu mostrado durante as repetições
            System.out.println("------- Cofrinho - Nicole Volcian Ascencao -------");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Total convertido (R$)");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            System.out.println();
        }
        sc.close();
    }
}
