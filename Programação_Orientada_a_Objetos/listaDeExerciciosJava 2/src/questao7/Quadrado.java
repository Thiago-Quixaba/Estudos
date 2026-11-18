package questao7;

public class Quadrado extends Retangulo {

    public Quadrado(float newLado) {
        super(newLado, newLado);
    }

    @Override
    public boolean setLado(float newLado) {
        if (newLado > 0) {
            super.setLado(newLado);
            super.setAltura(newLado);
            return true;
        }
        return false;
    }

    @Override
    public boolean setAltura(float newAltura) {
        if (newAltura > 0) {
            super.setLado(newAltura);
            super.setAltura(newAltura);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Lado: %.2f\nÁrea: %.2f\tPerímetro: %.2f", lado.get(), CalculArea(), CalcularPerimetro());
    }
}