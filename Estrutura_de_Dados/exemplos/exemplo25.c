#include <stdio.h>

int validarCPF(char cpf[]) {
    int tempCPF[11], d10 = 0, d11 = 0;
    for (int i = 0; i < 11; i++) {
        tempCPF[i] = cpf[i] - '0';
        if (i < 9) {
            d10 += tempCPF[i] * (10 - i);
            d11 += tempCPF[i] * (11 - i);
        }
    }

    int resto = d10 % 11;
    if (resto == 0 || resto == 1) {
        d10 = 0;
    } else {
        d10 = 11 - resto;
    }
    d11 += d10 * 2;
    resto = d11 % 11;
    if (resto == 0 || resto == 1) {
        d11 = 0;
    } else {
        d11 = 11 - resto;
    }

    if (d10 == tempCPF[9] && d11 == tempCPF[10]) {
        return 0;
    }
    return 1;
}

struct pessoa {
    char nome[51], cpf[12];
    int idade;
};

typedef struct pessoa Pessoa;

Pessoa criarPessoa() {
    Pessoa p;
    printf("Inserir Nome: ");
    scanf(" %50s", p.nome);

    do {
        printf("Inserir CPF: ");
        scanf(" %11s", p.cpf);
    } while (validarCPF(p.cpf) != 0);
    
    do {
        printf("Inserir Idade: ");
        scanf("%d", &p.idade);
    } while (p.idade < 0);

    return p;
}

void imprimirPessoa(Pessoa pessoa) {
    printf("Nome:\t%s\n", pessoa.nome);
    printf("CPF:\t%s\n", pessoa.cpf);
    printf("Idade:\t%d\n", pessoa.idade);
}

void main() {
    Pessoa p = criarPessoa();
    imprimirPessoa(p);
}