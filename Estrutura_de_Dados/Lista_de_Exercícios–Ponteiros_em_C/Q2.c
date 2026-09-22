#include <stdio.h>

void main() {
    int a, *p = &a;

    printf("%p: %d\n", p, *p);
}