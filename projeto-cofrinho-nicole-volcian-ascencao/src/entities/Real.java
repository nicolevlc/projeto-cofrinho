package entities;

// Classe filha Real herdando as caracteristicas da classe mãe Moeda
public class Real extends Moeda {
    // Criaçao do construtor Real recebendo o mesmo atributo da classe Moeda
    public Real(double valor) {
        super(valor);
    }

    // Sobrescrita do metodo info retornando o tipo da moeda e o valor
    @Override
    public String info() {
        return "Real: " + getValor();
    }

    // Sobrescrita do metodo converter onde neste caso so retorna o proprio valor
    @Override
    public double converter() {
        return getValor();
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
