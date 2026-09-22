#include <stdio.h>

void main() {
    int num[10], num2[10];

    for (int i = 0; i < 10; i++) {
        scanf("%d", &num[i]);
        num2[i] = num[i] * num[i];
    }
    for (int i = 0; i < 10; i++) {
        printf("%d\t", num[i]);
    }
    printf("\n");
    for (int i = 0; i < 10; i++) {
        printf("%d\t", num2[i]);
    }
}