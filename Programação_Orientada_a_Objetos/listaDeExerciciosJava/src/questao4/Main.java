package questao4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número positivo: ");
        int numero = input.nextInt(), soma = 0;

        if (numero >= 1) {
            for (int i = 1; i <= (int) numero / 2; i++) {
                if (numero % i == 0) {
                    soma += i;
                }
            }

            if (soma == numero) {
                System.err.printf("%d é um inteiro perfeito!\n", numero);
            } else {
                System.err.printf("%d não é um inteiro perfeito!\n", numero);
            }
        } else {
            System.err.printf("[!] %d não é um número positivo!\n", numero);
        }

        input.close();
    }
}
