package questao10;

import java.util.function.Supplier;

public class Vendedor extends Empregado {
    private String setorVendasValue;
    private double valorVendasValue;

    public Vendedor(String newNome, int newIdade, String newSexo, double newSalario, String newMatricula, String newSetorVendas, double newValorVendas) {
        super(newNome, newIdade, newSexo, newSalario, newMatricula);

        if (newSetorVendas != null && !newSetorVendas.isBlank()) {
            this.setorVendasValue = newSetorVendas;
        } else {
            this.setorVendasValue = "NO_SECTOR";
        }

        if (newValorVendas >= 0) {
            this.valorVendasValue = newValorVendas;
        } else {
            this.valorVendasValue = 0;
        }
    }

    public final Supplier<String> setorVendas = () -> this.setorVendasValue;
    public final Supplier<Double> valorVendas = () -> this.valorVendasValue;

    public boolean setSetorVendas(String newSetorVendas) {
        if (newSetorVendas != null && !newSetorVendas.isBlank()) {
            this.setorVendasValue = newSetorVendas;
            return true;
        }
        return false;
    }

    public boolean setValorVendas(double newValorVendas) {
        if (newValorVendas >= 0) {
            this.valorVendasValue = newValorVendas;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s\nSetor de vendas: %s\nValor de vendas: R$ %.2f", super.toString(), this.setorVendasValue, this.valorVendasValue);
    }
}