package questao17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrizA = new int[5][4], matrizB = new int[4][6], matrizAB = new int[5][6];

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe os valores da " + (i + 1) + "° linha da matriz A: ");
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = input.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            System.out.print("Informe os valores da " + (i + 1) + "° linha da matriz B: ");
            for (int j = 0; j < 6; j++) {
                matrizB[i][j] = input.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                matrizAB[i][j] = 0;
                for (int y = 0; y < 4; y++) {
                    matrizAB[i][j] += matrizA[i][y] * matrizB[y][j];
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrizAB[i][j] + "\t");
            }
            System.out.println();
        }

        input.close();
    }
}