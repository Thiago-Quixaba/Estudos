package questao11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int diagonalSecundaria = 0;

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("Informe o numero da %d° linha e %d° coluna: ", linha + 1, coluna + 1);
                matriz[linha][coluna] = input.nextInt();
            }
        }

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("[%d]\t", matriz[linha][coluna]);

                if (linha + coluna == 2) {
                    diagonalSecundaria += matriz[linha][coluna];
                }
            }
            System.out.print("\n");
        }
        System.out.printf("\nDiagonal Secundaria: %d\n", diagonalSecundaria);

        input.close();
    }
}
