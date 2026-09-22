package br.com.projeto;

import java.util.function.Supplier;

public class Cliente {
    private String nomeValue;
    private String cpfValue;
    private Endereco enderecoValue;
    private String dataNascimentoValue;

    public Cliente(String nomeValue, String cpfValue, Endereco enderecoValue, String dataNascimentoValue) {
        this.nomeValue = nomeValue;
        this.cpfValue = cpfValue;
        this.enderecoValue = enderecoValue;
        this.dataNascimentoValue = dataNascimentoValue;
    }

    public final Supplier<String> nome = () -> this.nomeValue;

    public final Supplier<String> CPF = () -> this.cpfValue;

    public final Supplier<Endereco> endereco = () -> this.enderecoValue;

    public final Supplier<String> dataNascimento = () -> this.dataNascimentoValue;

    public boolean setNome(String newNome) {
        if (!newNome.isBlank()) {
            this.nomeValue = newNome;
            return true;
        }
        return false;
    }

    public boolean setCPF(String newCPF) {
        if (!newCPF.isBlank()) {
            this.cpfValue = newCPF;
            return true;
        }
        return false;
    }

    public boolean setendereco(Endereco newendereco) {
        this.enderecoValue = newendereco;
        return true;
    }

    public boolean setDataNascimento(String newDataNascimento) {
        if (!newDataNascimento.isBlank()) {
            this.dataNascimentoValue = newDataNascimento;
            return true;
        }
        return false;
    }
}
