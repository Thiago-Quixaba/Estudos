package questao10;

import java.util.function.Supplier;

public class Empregado extends Pessoa {
    private double salarioValue;
    private String matriculaValue;

    public Empregado(String newNome, int newIdade, String newSexo, double newSalario, String newMatricula) {
        super(newNome, newIdade, newSexo);

        if (newSalario >= 0) {
            this.salarioValue = newSalario;
        } else {
            this.salarioValue = 0;
        }

        if (newMatricula != null && !newMatricula.isBlank()) {
            this.matriculaValue = newMatricula;
        } else {
            this.matriculaValue = "NO_REGISTER";
        }
    }

    public final Supplier<Double> salario = () -> this.salarioValue;
    public final Supplier<String> matricula = () -> this.matriculaValue;

    public boolean setSalario(double newSalario) {
        if (newSalario >= 0) {
            this.salarioValue = newSalario;
            return true;
        }
        return false;
    }

    public boolean setMatricula(String newMatricula) {
        if (newMatricula != null && !newMatricula.isBlank()) {
            this.matriculaValue = newMatricula;
            return true;
        }
        return false;
    }

    public double inss() {
        return this.salarioValue * 0.11;
    }

    @Override
    public String toString() {
        return String.format("%s\nMatrícula: %s\nSalário: R$ %.2f\nINSS: R$ %.2f", super.toString(), this.matriculaValue, this.salarioValue, inss());
    }
}