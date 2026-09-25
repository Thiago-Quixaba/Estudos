#include <stdio.h>

void exemplo21(char *palavra) {
    char *p = palavra;
    if (*p == '\0') {
        printf("");
    } else {
        exemplo21(++p);
        printf("%c", *--p);
    }
}

void main() {
    exemplo21("Hello");
}