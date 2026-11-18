package questao4;

import java.util.function.Supplier;

public class AgendaEnderecos {
    private String nomeValue;
    private String telefoneValue;
    private Data dataAniversarioValue;
    private Endereco enderecoValue;

    private static int qtdCadastros = 0;

    public AgendaEnderecos(String newNome, String newTelefone, Data newDataAniversario, Endereco newEndereco) {
        if (newNome != null && !newNome.isBlank()) {
            this.nomeValue = newNome;
        } else {
            this.nomeValue = "NO_NAME";
        }

        if (newTelefone != null && !newTelefone.isBlank() && newTelefone.length() == 11) {
            this.telefoneValue = newTelefone;
        } else {
            this.telefoneValue = null;
        }

        this.dataAniversarioValue = newDataAniversario;

        this.enderecoValue = newEndereco;

        qtdCadastros++;
    }

    public final Supplier<String> nome = () -> this.nomeValue;

    public final Supplier<String> telefone = () -> this.telefoneValue;

    public final Supplier<Data> dataAniversario = () -> this.dataAniversarioValue;

    public final Supplier<Endereco> endereco = () -> this.enderecoValue;

    public static final Supplier<Integer> quantidadeCadastros = () -> qtdCadastros;

    public boolean setNome(String newNome) {
        if (newNome != null && !newNome.isBlank()) {
            this.nomeValue = newNome;
            return true;
        }
        return false;
    }

    public boolean setTelefone(String newTelefone) {
        if (newTelefone!= null && !newTelefone.isBlank() && newTelefone.length() == 11) {
            this.telefoneValue = newTelefone;
            return true;
        }
        return false;
    }

    public boolean setDataAniversario(Data newDataAniversario) {
        this.dataAniversarioValue = newDataAniversario;
        return true;
    }

    public boolean setEndereco(Endereco newEndereco) {
        this.enderecoValue = newEndereco;
        return true;
    }
}
