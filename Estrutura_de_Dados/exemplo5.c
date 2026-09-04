#include <stdio.h>

void main() {
    float a, b;
    char op;
    
    printf("Informe o primeiro valor: ");
    scanf("%f", &a);
    printf("['+' -> Adiçao | '-' -> Subtraçao | '*' -> Multiplicaçao | '/' -> Divisao]\nInforme a operaçao desejada: ");
    scanf(" %c", &op);

    switch (op){
        case '+':
            printf("Informe o segundo valor: ");
            scanf("%f", &b);
            printf("%f + %f = %f\n", a, b, a + b);
            break;
        case '-':
            printf("Informe o segundo valor: ");
            scanf("%f", &b);
            printf("%f - %f = %f\n", a, b, a - b);
            break;
        case '*':
            printf("Informe o segundo valor: ");
            scanf("%f", &b);
            printf("%f * %f = %f\n", a, b, a * b);
            break;
        case '/':
            printf("Informe o divisor: ");
            scanf("%f", &b);
            if (b == 0) {
                printf("Indefinido");
                break;
            }
            printf("%f / %f = %f\n", a, b, a / b);
            break;
        default:
            printf("Operaçao Invalida!\n");
            break;
    }
}