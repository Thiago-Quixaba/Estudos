#include <stdio.h>

void main() {
    char palavras[3][101];

    scanf(" %100s %100s %100s", palavras[0], palavras[1], palavras[2]);
    
    for (int i = 2; i >= 0; i--) {
        printf("%s\n", palavras[i]);
    }
}