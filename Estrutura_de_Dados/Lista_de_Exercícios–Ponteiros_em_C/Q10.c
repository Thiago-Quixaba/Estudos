#include <stdio.h>

void contar_vogal(char *palavra) {
    int a = 0, e = 0, i = 0, o = 0, u = 0;
    char *index = palavra;

    for (index; *index != '\0'; index++) {
        switch (*index) {
            case 'a': case 'A': a++; break;
            case 'e': case 'E': e++; break;
            case 'i': case 'I': i++; break;
            case 'o': case 'O': o++; break;
            case 'u': case 'U': u++; break;
            default: break;
        }
    }

    printf("A: %d\tE: %d\tI: %d\tO: %d\tU: %d\n", a, e, i, o, u);
}

void main() {
    char string[] = "hello, world!";
    contar_vogal(&string[0]);
}