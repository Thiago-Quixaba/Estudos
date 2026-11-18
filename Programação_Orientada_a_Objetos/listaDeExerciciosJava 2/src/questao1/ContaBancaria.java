package questao1;

import java.util.function.Supplier;

public class ContaBancaria {
    private String titularValue;
    private double saldoValue;

    public ContaBancaria(String newTitular, double newSaldo) {
        if (!newTitular.isBlank()) {
            this.titularValue = newTitular;
        } else {
            this.titularValue = "NO NAME";
        }

        if (newSaldo >= 0) {
            this.saldoValue = newSaldo;
        } else {
            this.saldoValue = 0;
        }
        
    }


    
    public final Supplier<String> titular = () -> this.titularValue;

    public final Supplier<Double> saldo = () -> this.saldoValue;

    public boolean setTitular(String newTitular) {
        if (!newTitular.isBlank()) {
            this.titularValue = newTitular;
            return true;
        }
        return false;
    }



    public boolean depositar(double value) {
        if (value > 0) {
            this.saldoValue += value;
            return true;
        }
        return false;
    }

    public boolean sacar(double value) {
        if (value > 0 && value <= this.saldoValue) {
            this.saldoValue -= value;
            return true;
        }
        return false;
    }
}

