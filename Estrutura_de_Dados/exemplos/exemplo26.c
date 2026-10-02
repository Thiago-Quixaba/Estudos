#include <stdio.h>
#include <stdlib.h>

struct tmatriz {
    int tamanho;
    int **matriz;
};

typedef struct tmatriz Tmatriz;

Tmatriz criarMatriz(int n) {
    Tmatriz newMatriz;
    newMatriz.tamanho = n;
    
    newMatriz.matriz = (int**) calloc(n, sizeof(int *));
    for (int i = 0; i < n; i++) {
        newMatriz.matriz[i] = (int *) calloc(n, sizeof(int));
    }

    return newMatriz;
}

Tmatriz somaMatrizes(Tmatriz matrizA, Tmatriz matrizB) {
    if (matrizA.tamanho == matrizB.tamanho) {
        Tmatriz newMatriz = criarMatriz(matrizA.tamanho);
        for (int i = 0; i < matrizA.tamanho; i++) {
            for (int j = 0; j < matrizA.tamanho; j++) {
                newMatriz.matriz[i][j] = matrizA.matriz[i][j] + matrizB.matriz[i][j];
            }
        }

        return newMatriz;
    }
}

Tmatriz MultiplicacaoMatrizes(Tmatriz matrizA, Tmatriz matrizB) {
    if (matrizA.tamanho == matrizB.tamanho) {
        Tmatriz newMatriz = criarMatriz(matrizA.tamanho);
        for (int i = 0; i < matrizA.tamanho; i++) {
            for (int j = 0; j < matrizA.tamanho; j++) {
                newMatriz.matriz[i][j] = 0;
                for (int l = 0; l < matrizA.tamanho; l++) {
                    newMatriz.matriz[i][j] += matrizA.matriz[i][l] * matrizB.matriz[l][j];
                }
            }
            
        }

        return newMatriz;
    }
}

void imprimirMatriz(Tmatriz matriz) {
    for (int i = 0; i < matriz.tamanho; i++) {
        for (int j = 0; j < matriz.tamanho; j++) {
            printf("%d", matriz.matriz[i][j]);
            printf(j == matriz.tamanho - 1 ? "\n" : "\t");
        }
    }
}

void main() {
    Tmatriz matrizA = criarMatriz(2);
    matrizA.matriz[0][0] = 1;
    matrizA.matriz[0][1] = 2;
    matrizA.matriz[1][0] = 3;
    matrizA.matriz[1][1] = 4;

    Tmatriz matrizB = criarMatriz(2);
    matrizB.matriz[0][0] = 5;
    matrizB.matriz[0][1] = 6;
    matrizB.matriz[1][0] = 7;
    matrizB.matriz[1][1] = 8;


    imprimirMatriz(somaMatrizes(matrizA, matrizB));
    printf("\n");
    imprimirMatriz(MultiplicacaoMatrizes(matrizA, matrizB));
}