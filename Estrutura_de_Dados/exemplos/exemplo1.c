#include <stdio.h>

void main() {
    int x, y, z;

    scanf("%d %d %d", &x, &y, &z);

    printf("x = %d, y = %d, z = %d\nr = %d\n", x, y, z, (x * x * x) + (y * y) + (x * y * z));
}