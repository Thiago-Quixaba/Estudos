#include <stdio.h>

void main() {
    char palavra[101], *p = palavra;
    int letras = 0;

    fgets(palavra, sizeof(palavra), stdin);

    for (p; *p != '\0'; p++) {
        if (*p != ' ' && *p != '\n' && *p != '\t') {
            letras++;
        } else if (*p == '\n') {
            *p = '\0';
            break;
        }
    }

    printf("Quantidade de letras da palavra \"%s\": %d\n", palavra, letras);
}