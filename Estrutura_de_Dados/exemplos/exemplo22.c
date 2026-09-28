#include <stdio.h>

int soma(int *atual, int *fim) {
    if (atual == fim) {
        return *atual;
    } else {
        return *atual + soma(++atual, fim);
    }
}
int exemplo22(int *vetor, int tamanho) {
    return soma(vetor, vetor + (tamanho - 1));
}

void main() {
    int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    printf("%d\n", exemplo22(vetor, 10));
}