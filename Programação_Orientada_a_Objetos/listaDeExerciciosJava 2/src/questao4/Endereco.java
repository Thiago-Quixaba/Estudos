package questao4;

public class Endereco {
    private String estadoValue;
    private String cidadeValue;
    private String bairroValue;
    private String ruaValue;
    private int numeroValue;
    
    public Endereco(String newEstado, String newCidade, String newBairro, String newRua, int newNumero) {
        this.estadoValue = newEstado;
        this.cidadeValue = newCidade;
        this.bairroValue = newBairro;
        this.ruaValue = newRua;
        this.numeroValue = newNumero;
    }

    @Override 
    public String toString() { 
        return String.format("Estado: %s\tCidade: %s\nBairro: %s\tRua: %s\tNúmero: %d", estadoValue, cidadeValue, bairroValue, ruaValue, numeroValue);
    }

    public void setData(String newEstado, String newCidade, String newBairro, String newRua, int newNumero) {
        this.estadoValue = newEstado;
        this.cidadeValue = newCidade;
        this.bairroValue = newBairro;
        this.ruaValue = newRua;
        this.numeroValue = newNumero;
    }
}
