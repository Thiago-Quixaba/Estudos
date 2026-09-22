#include <stdio.h>

void main() {
    int a, b, c;

    scanf("%d %d %d", &a, &b, &c);

    if (a == b == c) {
        printf("Equilatero\n");
    } else if (a != b != c ) {
        printf("Escaleno \n");
    } else {
        printf("Isoceles\n");
    }
}