package questao7;

import java.util.function.Supplier;

public class Retangulo extends Forma {
    private float ladoValue;
    private float alturaValue;

    public Retangulo(float newLado, float newAltura) {
        if (newLado > 0) {
            this.ladoValue = newLado;
        } else {
            this.ladoValue = 0;
        }

        if (newAltura > 0) {
            this.alturaValue = newAltura;
        } else {
            this.alturaValue = 0;
        }
    }

    public final Supplier<Float> lado = () -> this.ladoValue;
    public final Supplier<Float> altura = () -> this.alturaValue;

    public boolean setLado(float newLado) {
        if (newLado > 0) {
            this.ladoValue = newLado;
            return true;
        }
        return false;
    }

    public boolean setAltura(float newAltura) {
        if (newAltura > 0) {
            this.alturaValue = newAltura;
            return true;
        }
        return false;
    }

    @Override
    public float CalculArea() {
        return this.ladoValue * this.alturaValue;
    }

    @Override
    public float CalcularPerimetro() {
        return 2 * (this.ladoValue + this.alturaValue);
    }

    @Override
    public String toString() {
        return String.format("Lado: %.2f\tAltura: %.2f\nÁrea: %.2f\tPerímetro: %.2f", this.ladoValue, this.alturaValue, CalculArea(), CalcularPerimetro());
    }
}