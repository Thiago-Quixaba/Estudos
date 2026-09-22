#include <stdio.h>

void main() {
    float vetor[10];
    int maior, menor;

    for (int i = 0; i < 10; i++) {
        scanf("%f", &vetor[i]);
        if (i == 0) {
            maior = 0;
            menor = 0;
        } else if (vetor[i] > vetor[maior]) {
            maior = i;
        } else if (vetor[i] < vetor[menor]) {
            menor = i;
        }   
    }

    printf("Maior: %f\tMenor: %f\n", vetor[maior], vetor[menor]);
}