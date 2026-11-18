package questao10;

import java.util.function.Supplier;

public class Pessoa {
    private String nomeValue;
    private int idadeValue;
    private String sexoValue;

    public Pessoa(String newNome, int newIdade, String newSexo) {
        if (newNome != null && !newNome.isBlank()) {
            this.nomeValue = newNome;
        } else {
            this.nomeValue = "NO_NAME";
        }

        if (newIdade >= 0) {
            this.idadeValue = newIdade;
        } else {
            this.idadeValue = 0;
        }

        if (newSexo != null && !newSexo.isBlank()) {
            this.sexoValue = newSexo;
        } else {
            this.sexoValue = "NO_SEXO";
        }
    }

    public final Supplier<String> nome = () -> this.nomeValue;
    public final Supplier<Integer> idade = () -> this.idadeValue;
    public final Supplier<String> sexo = () -> this.sexoValue;

    public boolean setNome(String newNome) {
        if (newNome != null && !newNome.isBlank()) {
            this.nomeValue = newNome;
            return true;
        }
        return false;
    }

    public boolean setIdade(int newIdade) {
        if (newIdade >= 0) {
            this.idadeValue = newIdade;
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
        return String.format("Nome: %s\tIdade: %d\nSexo: %s", this.nomeValue, this.idadeValue, this.sexoValue);
    }
}