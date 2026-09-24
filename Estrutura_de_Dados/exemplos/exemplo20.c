#include <stdio.h>

int exemplo20(char *palavra, char alvo) {
    char *p = palavra;
    if (*p == '\0') {
        return 0;
    } else if (*p == alvo) {
        return 1 + exemplo20(++p, alvo);
    } else {
        return 0 + exemplo20(++p, alvo);
    }
}

void main() {

    printf("%d", exemplo20("", ''));
}