#include <stdio.h>

void copia(char *dest, char *orig) {
    char *inicio = dest;

    for (orig; *orig != '\0'; orig++) {
        *dest = *orig;
        dest++;
    }
    dest = '\0';

    printf("%s", inicio);
}

void main() {
    char string[] = "hello, world!", *novaString;
    copia(novaString, &string[0]);
}