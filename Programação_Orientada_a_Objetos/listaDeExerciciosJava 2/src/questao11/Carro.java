package questao11;

import java.util.function.Supplier;

public class Carro extends Veiculo {
    private int quantidadePortasValue;
    private String classificacaoValue;

    public Carro(String newMarca, int newQuantidadeRodas, int newNumeroMarchas, String newModelo, double newVelocidade, int newQuantidadePortas, String newClassificacao) {
        super(newMarca, newQuantidadeRodas, newNumeroMarchas, newModelo, newVelocidade, true);

        if (newQuantidadePortas > 0) {
            this.quantidadePortasValue = newQuantidadePortas;
        } else {
            this.quantidadePortasValue = 0;
        }

        if (newClassificacao != null && (newClassificacao.equalsIgnoreCase("SUV") || newClassificacao.equalsIgnoreCase("Sedan") || newClassificacao.equalsIgnoreCase("Hatch"))) {
            this.classificacaoValue = newClassificacao;
        } else {
            this.classificacaoValue = "NÃO INFORMADA";
        }
    }

    public final Supplier<Integer> quantidadePortas = () -> this.quantidadePortasValue;
    public final Supplier<String> classificacao = () -> this.classificacaoValue;

    public boolean setQuantidadePortas(int newQuantidadePortas) {
        if (newQuantidadePortas > 0) {
            this.quantidadePortasValue = newQuantidadePortas;
            return true;
        }
        return false;
    }

    public boolean setClassificacao(String newClassificacao) {
        if (newClassificacao != null && (newClassificacao.equalsIgnoreCase("SUV") || newClassificacao.equalsIgnoreCase("Sedan") || newClassificacao.equalsIgnoreCase("Hatch"))) {
            this.classificacaoValue = newClassificacao;
            return true;
        }
        return false;
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.printf("Quantidade de portas: %d\tClassificação: %s\n", this.quantidadePortasValue, this.classificacaoValue);
    }
}