package questao11;

import java.util.function.Supplier;

public class Caminhao extends Veiculo {
    private int quantidadeEixosValue;
    private double cargaMaximaValue;

    public Caminhao(String newMarca, int newQuantidadeRodas, int newNumeroMarchas, String newModelo, double newVelocidade, int newQuantidadeEixos, double newCargaMaxima) {
        super(newMarca, newQuantidadeRodas, newNumeroMarchas, newModelo, newVelocidade, true);

        if (newQuantidadeEixos > 0) {
            this.quantidadeEixosValue = newQuantidadeEixos;
        } else {
            this.quantidadeEixosValue = 0;
        }

        if (newCargaMaxima > 0) {
            this.cargaMaximaValue = newCargaMaxima;
        } else {
            this.cargaMaximaValue = 0;
        }
    }

    public final Supplier<Integer> quantidadeEixos = () -> this.quantidadeEixosValue;
    public final Supplier<Double> cargaMaxima = () -> this.cargaMaximaValue;

    public boolean setQuantidadeEixos(int newQuantidadeEixos) {
        if (newQuantidadeEixos > 0) {
            this.quantidadeEixosValue = newQuantidadeEixos;
            return true;
        }
        return false;
    }

    public boolean setCargaMaxima(double newCargaMaxima) {
        if (newCargaMaxima > 0) {
            this.cargaMaximaValue = newCargaMaxima;
            return true;
        }
        return false;
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.printf("Quantidade de eixos: %d\tCarga máxima: %.2f kg\n", this.quantidadeEixosValue, this.cargaMaximaValue);
    }
}