#include <stdio.h>

void main() {
    char palavra[101], *p = palavra;
    int letras = 0;

    scanf(" %s", palavra);

    for (p; *p != '\0'; p++) {
        letras++;
    }

    printf("Quantidade de letras: %d\n", letras);
}