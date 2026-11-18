package questao11;

import java.util.function.Supplier;

public class Bicicleta extends Veiculo {
    private int tamanhoValue;

    public Bicicleta(String newMarca, int newNumeroMarchas, String newModelo, double newVelocidade, int newTamanho) {
        super(newMarca, 2, newNumeroMarchas, newModelo, newVelocidade, false);

        if (newTamanho > 0) {
            this.tamanhoValue = newTamanho;
        } else {
            this.tamanhoValue = 0;
        }
    }

    public final Supplier<Integer> tamanho = () -> this.tamanhoValue;

    public boolean setTamanho(int newTamanho) {
        if (newTamanho > 0) {
            this.tamanhoValue = newTamanho;
            return true;
        }
        return false;
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.printf("Tamanho: %d\n", this.tamanhoValue);
    }
}