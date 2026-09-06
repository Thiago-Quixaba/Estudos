#include <stdio.h>

void main() {
    int qtd, idade;
    float media = 0;

    scanf("%d", &qtd);
    for (int i = 0; i < qtd; i++) {
        scanf("%d", &idade);
        media += idade;
    }
    printf("Idade: %.2f\n", media / qtd);
}