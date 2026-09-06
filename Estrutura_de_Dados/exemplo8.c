#include <stdio.h>

void main() {
    int num;

    scanf("%d", &num);
    if (10 >= num >= 1) {
        for (int i = 1; i <= 10; i++) {
            printf("%d x %d = %d\n", num, i, num * i);
        }
    }
}