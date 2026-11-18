package questao2;

import java.util.function.Supplier;

public class Livro {
    private String tituloValue;
    private String autorValue;
    private int anoPublicacaoValue;

    public Livro(String newTitulo, String newAutor, int newAnoPublicacao) {
        if (newTitulo == null || newTitulo.isBlank()) {
            this.tituloValue = "<NO NAME>";
        } else {
            this.tituloValue = newTitulo; 
        }

        if (newAutor == null || newAutor.isBlank()) {
            this.autorValue = "<NO NAME>";
        } else {
            this.autorValue = newAutor; 
        }

        this.anoPublicacaoValue = newAnoPublicacao;
    }


    
    public final Supplier<String> titulo = () -> this.tituloValue;

    public final Supplier<String> autor = () -> this.autorValue;

    public final Supplier<Integer> anoPublicacao = () -> this.anoPublicacaoValue;

    public boolean setTitulo(String newTitulo) {
        if (newTitulo != null && !newTitulo.isBlank()) {
            this.tituloValue = newTitulo;
            return true;
        }
        return false;
    }

    public boolean setAutor(String newAutor) {
        if (newAutor != null && !newAutor.isBlank()) {
            this.autorValue = newAutor;
            return true;
        }
        return false;
    }
}

