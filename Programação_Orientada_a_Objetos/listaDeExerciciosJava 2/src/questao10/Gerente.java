package questao10;

import java.util.function.Supplier;

public class Gerente extends Empregado {
    private String setorGerenciaValue;

    public Gerente(String newNome, int newIdade, String newSexo, double newSalario, String newMatricula, String newSetorGerencia) {
        super(newNome, newIdade, newSexo, newSalario, newMatricula);

        if (newSetorGerencia != null && !newSetorGerencia.isBlank()) {
            this.setorGerenciaValue = newSetorGerencia;
        } else {
            this.setorGerenciaValue = "NO_SECTOR";
        }
    }

    public final Supplier<String> setorGerencia = () -> this.setorGerenciaValue;

    public boolean setSetorGerencia(String newSetorGerencia) {
        if (newSetorGerencia != null && !newSetorGerencia.isBlank()) {
            this.setorGerenciaValue = newSetorGerencia;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s\nSetor de gerência: %s", super.toString(), this.setorGerenciaValue);
    }
}