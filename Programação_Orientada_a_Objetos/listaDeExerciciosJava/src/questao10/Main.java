package questao10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a primeira palavra: ");
        String palavraA = input.nextLine();
        System.out.print("Informe a segunda palavra: ");
        String palavraB = input.nextLine();

        System.out.printf("%b\n", verificarPalindromo.verificarPalindromo(palavraA, palavraB));
        input.close();
    }
}
