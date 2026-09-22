package br.com.projeto;

import java.util.function.Supplier;

public class Endereco {
    private int numeroValue;
    private String ruaValue;
    private String bairroValue;
    private String cidadeValue;
    private String estadoValue;
    private String paisValue;
    private String cepValue;

    public Endereco (int numeroValue, String ruaValue, String bairroValue, String cidadeValue, String estadoValue, String paisValue, String cepValue) {
        this.numeroValue = numeroValue;
        this.ruaValue = ruaValue;
        this.bairroValue = bairroValue;
        this.cidadeValue = cidadeValue;
        this.estadoValue = estadoValue;
        this.paisValue = paisValue;
        this.cepValue = cepValue;
    }

    public final Supplier<Integer> numero = () -> this.numeroValue;

    public final Supplier<String> rua = () -> this.ruaValue;

    public final Supplier<String> bairro = () -> this.bairroValue;

    public final Supplier<String> cidade = () -> this.cidadeValue;

    public final Supplier<String> estado = () -> this.estadoValue;

    public final Supplier<String> pais = () -> this.paisValue;

    public final Supplier<String> cep = () -> this.cepValue;

    public boolean setNumero(int newNumero) {
        if (newNumero >= 0) {
            this.numeroValue = newNumero;
            return true;
        }
        return false;
    }

    public boolean setRua(String newRua) {
        if (!newRua.isBlank()) {
            this.ruaValue = newRua;
            return true;
        }
        return false;
    }

    public boolean setBairro(String newBairro) {
        if (!newBairro.isBlank()) {
            this.bairroValue = newBairro;
            return true;
        }
        return false;
    }

    public boolean setCidade(String newCidade) {
        if (!newCidade.isBlank()) {
            this.cidadeValue = newCidade;
            return true;
        }
        return false;
    }

    public boolean setEstado(String newEstado) {
        if (!newEstado.isBlank()) {
            this.estadoValue = newEstado;
            return true;
        }
        return false;
    }

    public boolean setPais(String newPais) {
        if (!newPais.isBlank()) {
            this.paisValue = newPais;
            return true;
        }
        return false;
    }

    public boolean setCEP(String newCEP) {
        if (!newCEP.isBlank()) {
            this.cepValue = newCEP;
            return true;
        }
        return false;
    }

}
