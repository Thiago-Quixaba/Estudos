package questao8;

import java.util.function.Supplier;

public class Fatura {
    private String codigoValue;
    private String descricaoValue;
    private int quantidadeItensCompradosValue;
    private double precoPorItemValue;

    public Fatura(String newCodigo, String newDescricao, int newQuantidadeItensComprados, double newPrecoPorItem) {
        if (newCodigo != null && !newCodigo.isBlank()) {
            this.codigoValue = newCodigo;
        } else {
            this.codigoValue = "NO_CODE";
        }

        if (newDescricao != null && !newDescricao.isBlank()) {
            this.descricaoValue = newDescricao;
        } else {
            this.descricaoValue = "NO_DESCRIPTION";
        }

        if (newQuantidadeItensComprados > 0) {
            this.quantidadeItensCompradosValue = newQuantidadeItensComprados;
        } else {
            this.quantidadeItensCompradosValue = 0;
        }

        if (newPrecoPorItem > 0) {
            this.precoPorItemValue = newPrecoPorItem;
        } else {
            this.precoPorItemValue = 0;
        }
    }

    public final Supplier<String> codigo = () -> this.codigoValue;
    public final Supplier<String> descricao = () -> this.descricaoValue;
    public final Supplier<Integer> quantidadeItensComprados = () -> this.quantidadeItensCompradosValue;
    public final Supplier<Double> precoPorItem = () -> this.precoPorItemValue;

    public boolean setCodigo(String newCodigo) {
        if (newCodigo != null && !newCodigo.isBlank()) {
            this.codigoValue = newCodigo;
            return true;
        }
        return false;
    }

    public boolean setDescricao(String newDescricao) {
        if (newDescricao != null && !newDescricao.isBlank()) {
            this.descricaoValue = newDescricao;
            return true;
        }
        return false;
    }

    public boolean setQuantidadeItensComprados(int newQuantidadeItensComprados) {
        if (newQuantidadeItensComprados > 0) {
            this.quantidadeItensCompradosValue = newQuantidadeItensComprados;
            return true;
        }
        this.quantidadeItensCompradosValue = 0;
        return false;
    }

    public boolean setPrecoPorItem(double newPrecoPorItem) {
        if (newPrecoPorItem > 0) {
            this.precoPorItemValue = newPrecoPorItem;
            return true;
        }
        this.precoPorItemValue = 0;
        return false;
    }

    public double getTotalFatura() {
        double total = this.quantidadeItensCompradosValue * this.precoPorItemValue;

        if (total > 0) {
            return total;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Código: %s\nDescrição: %s\nQuantidade: %d\nPreço por item: R$ %.2f\nTotal da fatura: R$ %.2f", this.codigoValue, this.descricaoValue, this.quantidadeItensCompradosValue, this.precoPorItemValue, getTotalFatura());
    }
}