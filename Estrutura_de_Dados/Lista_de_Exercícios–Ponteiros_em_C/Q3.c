#include <stdio.h>

void main() {
    int a = 0, b = 0, *p = &a;

    printf("%p: %d\t%p: %d\n", p, *p, &b, b);
    (*p)++;

    printf("%p: %d\t%p: %d\n", p, *p, &b, b);
}