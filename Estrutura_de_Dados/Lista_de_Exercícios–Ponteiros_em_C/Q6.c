#include <stdio.h>

void main() {
    int numeros[8], *p = numeros, *fim = p + 8, maior, menor;

    for (int i = 0; i < 8; i++) {
        scanf("%d", &numeros[i]);
    }
    for (p; p < fim; p++) {
        if (p == numeros) {
            maior = *p;
            menor = *p;
        } else if (*p > maior) {
            maior = *p;
        } else if (*p < menor) {
            menor = *p;
        }
    }

    printf("Maior: %d\tMenor:%d\n", maior, menor);
}