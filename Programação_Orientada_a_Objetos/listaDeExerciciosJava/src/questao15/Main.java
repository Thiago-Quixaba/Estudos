package questao15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        int ordenado = 2, deltaPosicao = 0;
        String posicao = "[1,2]";

        System.out.print("Informe os valores do vetor: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = input.nextInt();
        }

        System.out.print("Informe o valor de X: ");
        int X = input.nextInt();
        int maiorX = 0, menorX = 0, igualX = 0;

        for (int i = 0; i < 10; i++) {
            if (numeros[i] > X) {
                maiorX++;
            } else if (numeros[i] < X) {
                menorX++;
            } else {
                igualX++;
            }

            if (i > 0) {
                if (ordenado != 0) {
                    if (i == 1) {
                        if (numeros[i] > numeros[i-1]) {
                            ordenado = 1;
                        } else if (numeros[i] < numeros[i-1]){
                            ordenado = -1;
                        }
                    } else if (ordenado == 1 && numeros[i] < numeros[i-1]) {
                        ordenado = 0;
                    } else if (ordenado == -1 && numeros[i] > numeros[i-1]) {
                        ordenado = 0;
                    }
                }

                int teste = numeros[i] - numeros[i-1];
                if (teste < 0) {
                    teste *= -1;
                }

                if (teste > deltaPosicao) {
                    posicao = "[" + i + "," + (i-1) + "]";
                    deltaPosicao = teste;
                }
            }

            
        }

        System.out.println("Maior distância entre as posições: " + posicao + " (Distância = " + deltaPosicao + ")");

        if (ordenado == 1) {
            System.out.println("O vetor está em ordem crescente.");
        } else if (ordenado == -1) {
            System.out.println("O vetor está em ordem decrescente.");
        } else if (ordenado == 0) {
            System.out.println("O vetor não está ordenado.");
        } else {
            System.out.println("Todos os elementos do vetor são iguais.");
        }

        System.out.println("Maiores que X: " + maiorX + " | Menores que X: " + menorX + " | Iguais a X: " + igualX);

        input.close();
    }
}