#include <stdio.h>

void main() {
    int a, b;

    scanf("%d %d", &a, &b);

    if (a >= b) {
        scanf("%d", &b);
        if (a >= b) {
            printf("%d\n", a);
        } else {
            printf("%d\n", b);
        }
    } else {
        scanf("%d", &a);
        if (a >= b) {
            printf("%d\n", a);
        } else {
            printf("%d\n", b);
        }
    }
}