#include <stdio.h>

void main() {
    int i = 0, qtd, idade;
    float media = 0;

    scanf("%d", &qtd);
    while (i < qtd) {
        scanf("%d", &idade);
        media += idade;
        i++;
    }

    printf("Idade: %f\n", media / qtd);
}