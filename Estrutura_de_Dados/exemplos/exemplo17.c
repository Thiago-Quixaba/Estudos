#include <stdio.h>

void main() {
    char palavra[101];
    int a = 0, e = 0, i = 0, o = 0, u = 0;

    scanf(" %100s", palavra);
    
    for (int j = 0; j < 101; j++) {
        switch (palavra[j]) {
            case 'a':
            case 'A':
                a++;
                break;
            case 'e':
            case 'E':
                e++;
                break;
            case 'i':
            case 'I':
                i++;
                break;
            case 'o':
            case 'O':
                o++;
                break;
            case 'u':
            case 'U':
                u++;
                break;
            default:
                break;
        }
    }
    printf("A: %d\tE: %d\tI: %d\tO: %d\tU: %d\n", a, e, i, o, u);
}