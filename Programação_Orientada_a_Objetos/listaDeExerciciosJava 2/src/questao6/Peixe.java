package questao6;

import java.util.function.Supplier;

public class Peixe extends Animal {
    private String tipoHabitatValue;

    public Peixe(String newNome, double newPeso, String newTipoHabitat) {
        super(newNome, newPeso);

        if (newTipoHabitat != null && (newTipoHabitat.equalsIgnoreCase("marinho") || newTipoHabitat.equalsIgnoreCase("água doce") || newTipoHabitat.equalsIgnoreCase("ornamental"))) {
            this.tipoHabitatValue = newTipoHabitat;
        } else {
            this.tipoHabitatValue = "NÃO INFORMADO";
        }
    }

    public final Supplier<String> tipoHabitat = () -> this.tipoHabitatValue;

    public boolean setTipoHabitat(String newTipoHabitat) {
        if (newTipoHabitat != null && (newTipoHabitat.equalsIgnoreCase("marinho") || newTipoHabitat.equalsIgnoreCase("água doce") || newTipoHabitat.equalsIgnoreCase("ornamental"))) {
            this.tipoHabitatValue = newTipoHabitat;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s\nHabitat: %s", super.toString(), this.tipoHabitatValue);
    }
}