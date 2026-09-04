#include <stdio.h>

void main() {
    int a, b;
    char op;

    scanf("%d %c %d", &a, &op, &b);

    switch (op){
    case '+':
        printf("%d + %d = %d\n", a, b, a + b);
        break;
    case '-':
        printf("%d - %d = %d\n", a, b, a - b);
        break;
    case '*':
        printf("%d - %d = %d\n", a, b, a * b);
        break;
    case '/':
        printf("%d - %d = %d\n", a, b, a / b);
        break;
    default:
        break;
    }
}