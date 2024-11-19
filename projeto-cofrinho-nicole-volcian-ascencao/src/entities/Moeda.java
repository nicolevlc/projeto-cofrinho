package entities;

import java.util.Objects;

// Criaçao da classe abstrata Moeda
public abstract class Moeda {
    private double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    // Criaçao do metodo getValor para poder acessa-lo, de acordo com o encapsulamento
    public double getValor() {
        return valor;
    }

    // Implementaçao dos metodos equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Moeda)) return false;
        Moeda moeda = (Moeda) o;
        return Double.compare(moeda.getValor(), getValor()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValor());
    }

    // Criaçao dos metodos abstrato info e converter, para que possam ser implementadas de acordo com sua classe
    public abstract String info();

    public abstract double converter();
}
