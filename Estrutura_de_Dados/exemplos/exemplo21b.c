#include <stdio.h>

void aux2(char *palavra, char *auxiliar) {
    if (*auxiliar != '\0') {
        *auxiliar = *palavra;
        aux2(--palavra, ++auxiliar);
    }
}

void aux(char *palavra, char *auxiliar, char *inicio) {
    if (*palavra == '\0') {
        *auxiliar = '\0';
        aux2(--auxiliar, inicio);
    } else {
        *auxiliar = *palavra;
        aux(++palavra, ++auxiliar, inicio);
    }
}

int count(char *palavra) {
    if (*palavra == '\0') {
        return 1;
    } else {
        return 1 + count(++palavra);
    }
}

char *exemplo21(char *palavra) {
    char auxiliar[count(palavra)];
    aux(palavra, auxiliar, palavra);
    return palavra;
}

void main() {
    char palavra[] = "Hello";
    printf("%s\n", exemplo21(palavra));
}