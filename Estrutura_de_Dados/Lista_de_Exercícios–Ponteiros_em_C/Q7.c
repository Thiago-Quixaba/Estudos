#include <stdio.h>

void main() {
    int numeros[10], *p = numeros, *fim = p + 10, pares = 0;

    for (int i = 0; i < 10; i++) {
        scanf("%d", &numeros[i]);
    }
    for (p; p < fim; p++) {
        if (*p % 2 == 0) {
            pares++;
        }
    }

    printf("Pares: %d\tImpares:%d\n", pares, 10 - pares);
}