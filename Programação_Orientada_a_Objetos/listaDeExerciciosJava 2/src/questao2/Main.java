package questao2;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Livro[] livros = new Livro[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Informe o titulo do " + (i+1) + "° livro: ");
            String titulo = input.nextLine();
            System.out.print("Informe o autor do livro '" + titulo + "': ");
            String autor = input.nextLine();
            System.out.print("Informe o ano de publicação do livro '" + titulo + "': ");
            int ano = input.nextInt();
            input.nextLine();

            livros[i] = new Livro(null, null, ano);
            livros[i].setTitulo(titulo);
            livros[i].setAutor(autor);
        }

        for (Livro livro : livros) {
            System.out.printf("Titulo: %s\tAutor: %s\tAno de Publicação: %d\n", livro.titulo.get(), livro.autor.get(), livro.anoPublicacao.get());
        }

        input.close();
    }
}