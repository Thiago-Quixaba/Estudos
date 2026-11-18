package questao11;

import java.util.function.Supplier;

public class Automovel extends Veiculo {
    private double potenciaMotorValue;
    private int numeroPassageirosValue;

    public Automovel(String newMarca, int newQuantidadeRodas, int newNumeroMarchas, String newModelo, double newVelocidade, double newPotenciaMotor, int newNumeroPassageiros) {
        super(newMarca, newQuantidadeRodas, newNumeroMarchas, newModelo, newVelocidade, true);

        if (newPotenciaMotor > 0) {
            this.potenciaMotorValue = newPotenciaMotor;
        } else {
            this.potenciaMotorValue = 0;
        }

        if (newNumeroPassageiros > 0) {
            this.numeroPassageirosValue = newNumeroPassageiros;
        } else {
            this.numeroPassageirosValue = 0;
        }
    }

    public final Supplier<Double> potenciaMotor = () -> this.potenciaMotorValue;
    public final Supplier<Integer> numeroPassageiros = () -> this.numeroPassageirosValue;

    public boolean setPotenciaMotor(double newPotenciaMotor) {
        if (newPotenciaMotor > 0) {
            this.potenciaMotorValue = newPotenciaMotor;
            return true;
        }
        return false;
    }

    public boolean setNumeroPassageiros(int newNumeroPassageiros) {
        if (newNumeroPassageiros > 0) {
            this.numeroPassageirosValue = newNumeroPassageiros;
            return true;
        }
        return false;
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.printf("Potência do motor: %.2f CV\tPassageiros: %d\n", this.potenciaMotorValue, this.numeroPassageirosValue);
    }
}