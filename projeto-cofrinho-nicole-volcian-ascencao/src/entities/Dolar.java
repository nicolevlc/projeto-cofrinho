package entities;

// Classe filha Dolar herdando as caracteristicas da classe mãe Moeda
public class Dolar extends Moeda {

    // Criaçao do construtor Dolar recebendo o mesmo atributo da classe Moeda
    public Dolar(double valor) {
        super(valor);
    }

    // Sobrescrita do metodo info retornando o tipo da moeda e o valor
    @Override
    public String info() {
        return "Dolar: " + getValor();
    }

    // Sobrescrita do metodo converter onde realiza-se o calculo do valor informado multiplicado pela cotaçao do Dolar em 19/11/2024.
    @Override
    public double converter() {
        return getValor() * 5.77;
    }

    // Criaçao dos metodos equals e hashCode
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
