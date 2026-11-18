package questao16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean progressao = true;

        System.out.print("Informe a sequencia de valores: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = input.nextInt();
            if (i >= 2 && progressao) {
                if (numeros[i] - numeros[i-1] != numeros[i-1] - numeros[i-2]) {
                    progressao = false;
                }
            }
        }

        if (progressao) {
            System.out.print("É uma progressão aritmética!\n" + "Termo Inicial: " + numeros[0] + "\tRazão: " + (numeros[1] - numeros[0]) + "\n");
        } else {
            System.out.print("Não é uma progressão aritmética!\n");
        }

        input.close();
    }
}