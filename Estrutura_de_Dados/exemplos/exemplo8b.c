#include <stdio.h>

void main() {
    int num, i = 1;

    scanf("%d", &num);
    while (i <= 10 && 10 >= num >= 1){
        printf("%d x %d = %d\n", num, i, num * i);
        i++;
    }
}