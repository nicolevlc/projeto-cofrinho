package entities;

// Classe filha Euro herdando as caracteristicas da classe mãe Moeda
public class Euro extends Moeda {

    // Criaçao do construtor Euro recebendo o mesmo atributo da classe Moeda
    public Euro(double valor) {
        super(valor);
    }

    // Sobrescrita do metodo info retornando o tipo da moeda e o valor
    @Override
    public String info() {
        return "Euro: " + getValor();
    }

    // Sobrescrita do metodo converter onde é realizado o calculo do valor informado multiplicado pela cotaçao do Euro em 19/11/2024.
    @Override
    public double converter() {
        return getValor() * 6.09;
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
