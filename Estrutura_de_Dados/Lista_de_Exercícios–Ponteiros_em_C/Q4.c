#include <stdio.h>

void main() {
    int numeros[5], *p = numeros, *fim = p + 5;

    for (p; p < fim; p++) {
        printf("%d\t", *p);
    }
    printf("\n");
}