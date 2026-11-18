package questao11;

import java.util.function.Supplier;

public class Veiculo {
    private String marcaValue;
    private int quantidadeRodasValue;
    private int numeroMarchasValue;
    private String modeloValue;
    private double velocidadeValue;
    private boolean possuiMotorValue;

    public Veiculo(String newMarca, int newQuantidadeRodas, int newNumeroMarchas, String newModelo, double newVelocidade, boolean newPossuiMotor) {
        if (newMarca != null && !newMarca.isBlank()) {
            this.marcaValue = newMarca;
        } else {
            this.marcaValue = "NO_BRAND";
        }

        if (newQuantidadeRodas >= 0) {
            this.quantidadeRodasValue = newQuantidadeRodas;
        } else {
            this.quantidadeRodasValue = 0;
        }

        if (newNumeroMarchas >= 0) {
            this.numeroMarchasValue = newNumeroMarchas;
        } else {
            this.numeroMarchasValue = 0;
        }

        if (newModelo != null && !newModelo.isBlank()) {
            this.modeloValue = newModelo;
        } else {
            this.modeloValue = "NO_MODEL";
        }

        if (Double.isFinite(newVelocidade) && newVelocidade >= 0) {
            this.velocidadeValue = newVelocidade;
        } else {
            this.velocidadeValue = 0;
        }

        this.possuiMotorValue = newPossuiMotor;
    }

    public final Supplier<String> marca = () -> this.marcaValue;
    public final Supplier<Integer> quantidadeRodas = () -> this.quantidadeRodasValue;
    public final Supplier<Integer> numeroMarchas = () -> this.numeroMarchasValue;
    public final Supplier<String> modelo = () -> this.modeloValue;
    public final Supplier<Double> velocidade = () -> this.velocidadeValue;
    public final Supplier<Boolean> possuiMotor = () -> this.possuiMotorValue;

    public boolean setMarca(String newMarca) {
        if (newMarca != null && !newMarca.isBlank()) {
            this.marcaValue = newMarca;
            return true;
        }
        return false;
    }

    public boolean setQuantidadeRodas(int newQuantidadeRodas) {
        if (newQuantidadeRodas >= 0) {
            this.quantidadeRodasValue = newQuantidadeRodas;
            return true;
        }
        return false;
    }

    public boolean setNumeroMarchas(int newNumeroMarchas) {
        if (newNumeroMarchas >= 0) {
            this.numeroMarchasValue = newNumeroMarchas;
            return true;
        }
        return false;
    }

    public boolean setModelo(String newModelo) {
        if (newModelo != null && !newModelo.isBlank()) {
            this.modeloValue = newModelo;
            return true;
        }
        return false;
    }

    public boolean setVelocidade(double newVelocidade) {
        if (Double.isFinite(newVelocidade) && newVelocidade >= 0) {
            this.velocidadeValue = newVelocidade;
            return true;
        }
        return false;
    }

    public boolean setPossuiMotor(boolean newPossuiMotor) {
        this.possuiMotorValue = newPossuiMotor;
        return true;
    }

    public boolean acelerar(double valor) {
        if (Double.isFinite(valor) && valor > 0 && Double.isFinite(this.velocidadeValue + valor)) {
            this.velocidadeValue += valor;
            return true;
        }
        return false;
    }

    public boolean subtrair(double valor) {
        if (Double.isFinite(valor) && valor > 0 && this.velocidadeValue >= valor) {
            this.velocidadeValue -= valor;
            return true;
        }
        return false;
    }

    public void imprimirInformacoes() {
        System.out.printf("Marca: %s\tModelo: %s\nRodas: %d\tMarchas: %d\nVelocidade: %.2f km/h\tPossui motor: %s\n", this.marcaValue, this.modeloValue, this.quantidadeRodasValue, this.numeroMarchasValue, this.velocidadeValue, this.possuiMotorValue ? "Sim" : "Não");
    }
}