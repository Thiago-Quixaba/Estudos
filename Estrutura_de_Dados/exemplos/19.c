#include <stdio.h>

float exemplo18(float x, int y) {
    if (y == 0) {
        return 1;
    } else if (y > 0) {
        if (y == 1) {
            return x;
        } 
        return x * exemplo18(x, y - 1);
    } else if (y < 0) {
        if (y == 1) {
            return 1 / x;
        } 
        return (1 / x) * exemplo18(x, y + 1);
    }
}

void main() {
    float x;
    scanf("%f", &x);
    int y;
    scanf("%d", &y);

    printf("%f", exemplo18(0, 0));
}