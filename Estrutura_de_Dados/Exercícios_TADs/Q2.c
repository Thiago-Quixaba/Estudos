#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct conta {
    int numeroConta[6], digitoVerificador, valida;
    float saldo;
    char nome[51];
};

typedef struct conta Conta;

Conta criarConta (char numeroContaCompleto[], float saldo, char nome[]) {
    int resto = 0;
    Conta conta;

    strncpy(conta.nome, nome, sizeof(conta.nome) - 1);
    conta.nome[sizeof(conta.nome) - 1] = '\0';

    conta.saldo = saldo;

    for (int i = 0; i < 8; i++){
        int temp = numeroContaCompleto[i] - '0';
        if (i < 6) {
            resto += temp * (7 - i);
            conta.numeroConta[i] = temp;
        } else if (i == 7) {
            resto = 11 - (resto % 11);
            if (resto >= 10) { resto = 0; }
            conta.digitoVerificador = temp;
            conta.valida = resto == temp ? 0 : 1;
        }
    }

    return conta;
}

void imprimirConta (Conta conta) {
    for (int i = 0; i < 6; i++) { printf("%d", conta.numeroConta[i]); }
    printf("-%d\t%.2f\t%s\n", conta.digitoVerificador, conta.saldo, conta.nome);
}

struct lista {
    Conta conta;
    struct lista* proxima;
    struct lista* anterior;
};

typedef struct lista Lista;

void addLista(Lista** atual, Conta conta) {
    Lista* novaContaLista = (Lista*) calloc(1, sizeof(Lista));

    novaContaLista->conta = conta;
    novaContaLista->proxima = *atual;
    if (*atual != NULL) { (*atual)->anterior = novaContaLista; }

    *atual = novaContaLista;
}

void imprimirListaConta (Lista** lista) {
    if (*lista != NULL) {
        imprimirConta((*lista)->conta);
        Lista* aux = (*lista)->proxima;
        imprimirListaConta(&aux); 
    }
}

void nextLista(Lista** atual) { if ((*atual)->proxima != NULL) { *atual = (*atual)->proxima; } }
void prevLista(Lista** atual) { if ((*atual)->anterior != NULL) { *atual = (*atual)->anterior; } }

void main() {
    Lista* validas = NULL;
    Lista* naoValidas = NULL;
    Conta temp;
    char numeroContaCompleto[8], nome[51];
    float saldo;

    while (1) {
        printf("Informe o número da conta (xxxxxx-x): ");
        fgets(numeroContaCompleto, 9, stdin);
        numeroContaCompleto[strcspn(numeroContaCompleto, "\n")] = '\0';
        if (strcmp(numeroContaCompleto, "0") == 0) { break; }
        while (getchar() != '\n');

        printf("Informe o nome do titular da conta: ");
        fgets(nome, 51, stdin);
        nome[strcspn(nome, "\n")] = '\0';

        printf("Informe o saldo da conta: ");
        scanf("%f", &saldo);
        while (getchar() != '\n');

        temp = criarConta(numeroContaCompleto, saldo, nome);
        if (temp.valida == 0) { addLista(&validas, temp); } else { addLista(&naoValidas, temp); }
    }

    printf("\nCONTAS DE NÚMERO CORRETO\n");
    imprimirListaConta(&validas);

    printf("\nCONTAS DE NÚMERO ERRADO\n");
    imprimirListaConta(&naoValidas);
}