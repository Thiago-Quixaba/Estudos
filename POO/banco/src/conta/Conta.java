package conta;

public class Conta {
    private int agencia;
    private int numeroConta;
    private double saldo;
    private String titular;

    public Conta(int agencia, int numeroConta, double saldo, String titular) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String toString() {
        return "\033[1mTitular: \033[0m" + this.titular + "\n\033[1mAgencia: \033[0m" + this.agencia + "\n\033[1mNumero da Conta: \033[0m" + this.numeroConta + "\n\033[1mSaldo: \033[0m" + this.saldo;
    }

    // getters e setters

    public int getAgencia() {
        return this.agencia;
    }

    public boolean setAgencia(int newAgencia) {
        if (newAgencia >= 0) {
            this.agencia = newAgencia;
            return true;
        }
        return false;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public boolean setNumeroConta(int newNumeroConta) {
        if (newNumeroConta >= 0) {
            this.numeroConta = newNumeroConta;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean setSaldo(double newSaldo) {
        if (newSaldo >= 0) {
            this.saldo = newSaldo;
            return true;
        }
        return false;
    }

    public String getTitular() {
        return this.titular;
    }

    public boolean setTitular(String newTitular) {
        if (!newTitular.isBlank()) {
            this.titular = newTitular;
            return true;
        }
        return false;
    }

    // Utilitarios

    public void extrato() {
        System.out.printf("\033[1m===== EXTRATO =====\033[0m\n\033[1mTitular: \033[0m%s\n\033[1mSaldo: \033[0m%.2f\n", this.titular, this.saldo);
    }

    public boolean depositar(double value) {
        if (value >= 0) {
            this.saldo += value;
            return true;
        }
        return false;
    }

    public boolean sacar(double value) {
        if (value >= 0 && value <= this.saldo) {
            this.saldo -= value;
            return true;
        }
        return false;
    }


}
