package questao2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite o tamanho dos lados do quadrado: ");
        int n = input.nextInt();

        if (n > 1 && n < 20) {
            for (int i = 1; i <= n; i++) {
                System.out.println(i == 1 || i == n ? "*".repeat(n) : "*" + " ".repeat(n - 2) + "*");
            }
        } else {
            System.err.println("[!] Tamanho inválido!");
        }

        input.close();
    }
}