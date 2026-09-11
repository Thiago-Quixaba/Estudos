package br.com.projeto;

import java.util.function.*;

public class ContaBancaria {
    private int agenciaValue;
    private int numeroContaValue;
    private double saldoValue;
    private Cliente titularValue;

    public ContaBancaria(int agencia, int numeroConta, double saldo, Cliente titular) {
        this.agenciaValue = agencia;
        this.numeroContaValue = numeroConta;
        this.saldoValue = saldo;
        this.titularValue = titular;
    }

    public String toString() {
        return "\033[1mTitular: \033[0m" + this.titularValue + "\n\033[1mAgencia: \033[0m" + this.agenciaValue + "\n\033[1mNumero da Conta: \033[0m" + this.numeroContaValue + "\n\033[1mSaldo: \033[0m" + this.saldoValue;
    }

    // getters e setters

    public final Supplier<Integer> agencia = () -> this.agenciaValue;

    public final Supplier<Integer> numeroConta = () -> this.numeroContaValue;

    public final Supplier<Double> saldo = () -> this.saldoValue;
    
    public final Supplier<Cliente> titular = () -> this.titularValue;

    public boolean setAgencia(int newAgencia) {
        if (newAgencia >= 0) {
            this.agenciaValue = newAgencia;
            return true;
        }
        return false;
    }

    public boolean setNumeroConta(int newNumeroConta) {
        if (newNumeroConta >= 0) {
            this.numeroContaValue = newNumeroConta;
            return true;
        }
        return false;
    }

    public boolean setSaldo(double newSaldo) {
        if (newSaldo >= 0) {
            this.saldoValue = newSaldo;
            return true;
        }
        return false;
    }

    public boolean setTitular(Cliente newTitular) {
        if (newTitular != null) {
            this.titularValue = newTitular;
            return true;
        }
        return false;
    }

    // Utilitarios

    
    public final Runnable verExtrato = () -> System.out.printf("\033[1m===== EXTRATO =====\033[0m\n\033[1mTitular: \033[0m%s\n\033[1mSaldo: \033[0m%.2f\n", this.titularValue, this.saldoValue);

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

    public boolean receber(double value, ContaBancaria origem) {
        if (origem != null) {
                if (value > 0 && value <= origem.saldoValue) {
                this.saldoValue += value;
                return true;
            }
        }
        return false;
    }

    public boolean transferir(double value, ContaBancaria destino) {
        if (destino != null) {
            if (value > 0 && value <= this.saldoValue) {
                this.saldoValue -= value;
                destino.receber(value, this);
                return true;
            }
        }
        return false;
    }


}
