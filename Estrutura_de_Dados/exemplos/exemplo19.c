#include <stdio.h>

int exemplo19(char *palavra) {
    char *p = palavra;
    if (*p == '\0') {
        return 0;
    } else {
        return 1 + exemplo19(++p);
    }
}

void main() {

    printf("%d", exemplo19(""));
}