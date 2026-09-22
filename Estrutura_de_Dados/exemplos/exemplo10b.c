#include <stdio.h>

void main() {
    int i = 0, num, pares = 0;

    while (i < 10) {
        scanf("%d", &num);
        if (num % 2 == 0) {
            pares++;
        }
        i++;
    }
    
    printf("Pares: %d \tImpares: %d\n", pares, 10 - pares);
}