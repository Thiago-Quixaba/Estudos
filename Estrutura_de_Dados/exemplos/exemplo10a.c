#include <stdio.h>

void main() {
    int i = 0, num, pares = 0;

    for (i; i < 10; i++) {
        scanf("%d", &num);
        if (num % 2 == 0) {
            pares++;
        }
    }
    
    printf("Pares: %d \tImpares: %d\n", pares, 10 - pares);
}