package questao7;

import java.util.function.Supplier;

public class Circulo extends Forma {
    private float raioValue;

    public Circulo(float newRaio) {
        if (newRaio > 0) {
            this.raioValue = newRaio;
        } else {
            this.raioValue = 0;
        }
    }

    public final Supplier<Float> raio = () -> this.raioValue;

    public boolean setRaio(float newRaio) {
        if (newRaio > 0) {
            this.raioValue = newRaio;
            return true;
        }
        return false;
    }

    @Override
    public float CalculArea() {
        return (float) (Math.PI * this.raioValue * this.raioValue);
    }

    @Override
    public float CalcularPerimetro() {
        return (float) (2 * Math.PI * this.raioValue);
    }

    @Override
    public String toString() {
        return String.format("Raio: %.2f\nÁrea: %.2f\tPerímetro: %.2f", this.raioValue, CalculArea(), CalcularPerimetro());
    }
}