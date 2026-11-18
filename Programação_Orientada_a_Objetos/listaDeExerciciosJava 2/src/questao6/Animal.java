package questao6;

import java.util.function.Supplier;

public class Animal {
    private String nomeValue;
    private double pesoValue;

    public Animal(String newNome, double newPeso) {
        if (newNome != null && !newNome.isBlank()) {
            this.nomeValue = newNome;
        } else {
            this.nomeValue = "NO_NAME";
        }

        if (newPeso > 0) {
            this.pesoValue = newPeso;
        } else {
            this.pesoValue = 0;
        }
    }

    public final Supplier<String> nome = () -> this.nomeValue;
    public final Supplier<Double> peso = () -> this.pesoValue;

    public boolean setNome(String newNome) {
        if (newNome != null && !newNome.isBlank()) {
            this.nomeValue = newNome;
            return true;
        }
        return false;
    }

    public boolean setPeso(double newPeso) {
        if (newPeso > 0) {
            this.pesoValue = newPeso;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\tPeso: %.2f kg", this.nomeValue, this.pesoValue);
    }
}