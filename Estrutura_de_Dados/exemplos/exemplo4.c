#include <stdio.h>

void main() {
    int idade;

    printf("Informe sua idade: ");
    scanf("%d", &idade);

    switch (idade){
        case 0 ... 4:
            printf("Voce eh um bebe.\n");
            break;
        case 5 ... 12:
            printf("Voce eh uma criança.\n");
            break;
        case 13 ... 21:
            printf("Voce eh um adolescente.\n");
            break;
        case 22 ... 60:
            printf("voce eh um adulto.");
            break;
        case 61 ... 120:
            printf("Voce eh um idoso.");
            break;
        default:
            printf("Voce nao esta vivo.");
            break;
    }
}