#include <stdio.h>

void main() {
    char palavras[3][101] = {"IFPI", "", ""};
    int saoIguais = 1, igualifpi[2] = {1, 1};

    scanf(" %100s %100s", palavras[1], palavras[2]);
    for (int i = 0; i < 101; i++) {
        if (i <= 5) {
            if (palavras[1][i] != palavras[0][i]) {
                igualifpi[0] = 0;
            }
            if (palavras[2][i] != palavras[0][i]) {
                igualifpi[1] = 0;
            }
        } else {
            igualifpi[0] = 0;
            igualifpi[1] = 0;
        }
        
        if (palavras[1][i] != palavras[2][i]) {
            saoIguais = 0;
        }

        if (saoIguais == 0 && igualifpi[0] == 0 && igualifpi[1] == 0) {
            break;
        }

        if (palavras[1][i] == '\0' && palavras[2][i] == '\0') {
            break;
        } else if (palavras[1][i] == '\0') {
            saoIguais = 0;
            igualifpi[0] = 0;
            break;
        } else if (palavras[2][i] == '\0'){
            saoIguais = 0;
            igualifpi[1] = 0;
            break;
        }
    }

    printf("As palavras sao %s\n%s", saoIguais ? "iguais" : "diferentes", (igualifpi[0] || igualifpi[1]) ? ((igualifpi[0] && igualifpi[1]) ? "Ambas sao iguais a IFPI" : (igualifpi[0] ? "A primeira palavra eh igual a IFPI" : "A segunda palavra eh igual a IFPI")) : "Nenhuma eh igual a IFPI");

}