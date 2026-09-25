#include <stdio.h>

int exemplo23(int num) {
    if (num >= 0) {
        if (num <= 1) {
            return num;
        } else if (num == 2) {
            return 1;
        } else {
            return exemplo23(num - 1) + exemplo23(num - 2);
        }
    } 
}

void main() {
    printf("%d\n", exemplo23(45));
}