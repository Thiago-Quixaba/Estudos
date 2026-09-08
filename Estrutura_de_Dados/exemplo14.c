#include <stdio.h>

void main() {
    int num[10], num2[10];

    for (int i = 0; i < 10; i++) {
        scan("%d", &num[i]);
        num2[i] = num[i] * num[i];
    }
}