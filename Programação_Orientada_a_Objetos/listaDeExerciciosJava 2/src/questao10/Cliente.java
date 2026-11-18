package questao10;

import java.util.function.Supplier;

public class Cliente extends Pessoa {
    private double valorDividaValue;
    private String telefoneValue;

    public Cliente(String newNome, int newIdade, String newSexo, double newValorDivida, String newTelefone) {
        super(newNome, newIdade, newSexo);

        if (newValorDivida >= 0) {
            this.valorDividaValue = newValorDivida;
        } else {
            this.valorDividaValue = 0;
        }

        if (newTelefone != null && !newTelefone.isBlank()) {
            this.telefoneValue = newTelefone;
        } else {
            this.telefoneValue = "NO_PHONE";
        }
    }

    public final Supplier<Double> valorDivida = () -> this.valorDividaValue;
    public final Supplier<String> telefone = () -> this.telefoneValue;

    public boolean setValorDivida(double newValorDivida) {
        if (newValorDivida >= 0) {
            this.valorDividaValue = newValorDivida;
            return true;
        }
        return false;
    }

    public boolean setTelefone(String newTelefone) {
        if (newTelefone != null && !newTelefone.isBlank()) {
            this.telefoneValue = newTelefone;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s\nTelefone: %s\nValor da dívida: R$ %.2f", super.toString(), this.telefoneValue, this.valorDividaValue);
    }
}