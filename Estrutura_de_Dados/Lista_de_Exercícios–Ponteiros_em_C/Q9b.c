#include <stdio.h>

char *copia(char *dest, char *orig) {
    char *inicio = dest;

    for (orig; *orig != '\0'; orig++) {
        *dest = *orig;
        dest++;
    }
    dest = '\0';

    return inicio;
}

void main() {
    char string[] = "hello, world!", *novaString;
    novaString = copia(novaString, &string[0]);
    printf("%s", novaString[0]);
}