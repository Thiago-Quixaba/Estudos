#include <stdio.h>

void main() {
    int numeros[10], *p = numeros, *fim = p + 8, soma = 0;

    for (int i = 0; i < 10; i++) {
        scanf("%d", &numeros[i]);
    }
    for (p; p < fim; p++) {
        soma += *p;
    }

    printf("%d\n", soma);
}