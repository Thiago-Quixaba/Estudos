#include <stdio.h>

void main() {
    int numeros[3][3], *p = &numeros[0][0], soma = 0;

    for (int i = 1; i < 10; i++) {
        *p = i;
        p++;
    }

    p = &numeros[0][0];

    for (int i = 0; i < 9; i++) {
        soma += *p;
        p++;
    }
    printf("%d\n", soma);
}