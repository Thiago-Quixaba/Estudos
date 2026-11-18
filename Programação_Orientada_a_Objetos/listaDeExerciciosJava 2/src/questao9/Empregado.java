package questao9;

import java.util.function.Supplier;

public class Empregado {
    private String nomeValue;
    private String sobrenomeValue;
    private double salarioMensalValue;

    private static int qtdEmpregados = 0;

    public Empregado(String newNome, String newSobrenome, double newSalarioMensal) {
        if (newNome != null && !newNome.isBlank()) {
            this.nomeValue = newNome;
        } else {
            this.nomeValue = "NO_NAME";
        }

        if (newSobrenome != null && !newSobrenome.isBlank()) {
            this.sobrenomeValue = newSobrenome;
        } else {
            this.sobrenomeValue = "NO_SURNAME";
        }

        if (newSalarioMensal >= 0) {
            this.salarioMensalValue = newSalarioMensal;
        } else {
            this.salarioMensalValue = 0;
        }

        qtdEmpregados++;
    }

    public final Supplier<String> nome = () -> this.nomeValue;
    public final Supplier<String> sobrenome = () -> this.sobrenomeValue;
    public final Supplier<Double> salarioMensal = () -> this.salarioMensalValue;

    public static final Supplier<Integer> quantidadeEmpregados = () -> qtdEmpregados;

    public boolean setNome(String newNome) {
        if (newNome != null && !newNome.isBlank()) {
            this.nomeValue = newNome;
            return true;
        }
        return false;
    }

    public boolean setSobrenome(String newSobrenome) {
        if (newSobrenome != null && !newSobrenome.isBlank()) {
            this.sobrenomeValue = newSobrenome;
            return true;
        }
        return false;
    }

    public boolean setSalarioMensal(double newSalarioMensal) {
        if (newSalarioMensal >= 0) {
            this.salarioMensalValue = newSalarioMensal;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s %s\nSalário mensal: R$ %.2f", this.nomeValue, this.sobrenomeValue, this.salarioMensalValue);
    }
}