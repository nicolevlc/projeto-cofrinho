package entities;

import java.util.ArrayList;

// Implementação da classe entities.Cofrinho
public class Cofrinho {
    // Instanciaçao para a lista de moedas
    ArrayList<Moeda> listaMoedas = new ArrayList<>();

    // Metodo para que seja possivel adicionar nova moeda quando chamado
    public void adicionar(Moeda m){
        listaMoedas.add(m);
    }

    // Metodo para que seja possivel remover uma moeda quando chamado
    public void remover(Moeda m) {
        listaMoedas.remove(m);
    }

    // Metodo para que seja possivel listas todas as moedas quando chamado
    public void listagemMoedas(){
        for (Moeda m : listaMoedas){
            System.out.println(m.info());;
        }
    }

    // Metodo para que seja possivel somar o valor total ja convertido quando chamado
    public String totalConvertido() {
        double soma = 0;
        for (Moeda m : listaMoedas){
            soma += m.converter();
        }

        // Utilização do String.format para formatar um valor double para uma String
        return "Total convertido: R$ " + String.format("%.2f", soma);
    }
}
