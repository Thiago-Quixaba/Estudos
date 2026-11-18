package questao6;

import java.util.function.Supplier;

public class Cachorro extends Animal {
    private String racaValue;
    private String sexoValue;

    public Cachorro(String newNome, double newPeso, String newRaca, String newSexo) {
        super(newNome, newPeso);

        if (newRaca != null && !newRaca.isBlank()) {
            this.racaValue = newRaca;
        } else {
            this.racaValue = "NÃO INFORMADA";
        }

        if (newSexo != null && !newSexo.isBlank()) {
            this.sexoValue = newSexo;
        } else {
            this.sexoValue = "NÃO INFORMADO";
        }
    }

    public final Supplier<String> raca = () -> this.racaValue;
    public final Supplier<String> sexo = () -> this.sexoValue;

    public boolean setRaca(String newRaca) {
        if (newRaca != null && !newRaca.isBlank()) {
            this.racaValue = newRaca;
            return true;
        }
        return false;
    }

    public boolean setSexo(String newSexo) {
        if (newSexo != null && !newSexo.isBlank()) {
            this.sexoValue = newSexo;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s\nRaça: %s\tSexo: %s", super.toString(), this.racaValue, this.sexoValue);
    }
}