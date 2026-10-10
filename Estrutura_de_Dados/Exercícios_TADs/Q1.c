#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct empregado {
    int inscricao, classe; 
    char nome[51];
    float horas, extras;
};

typedef struct empregado Empregado;

Empregado cadastrarEmpregado(int inscricao, char nome[], int classe, float horas, float extras) {
    Empregado novoEmpregado;

    novoEmpregado.inscricao = inscricao;
    strncpy(novoEmpregado.nome, nome, sizeof(novoEmpregado.nome) - 1);
    novoEmpregado.nome[sizeof(novoEmpregado.nome) - 1] = '\0';
    novoEmpregado.classe = classe;
    novoEmpregado.horas = horas;
    novoEmpregado.extras = extras;

    return novoEmpregado;
}

void imprimirEmpregado(Empregado funcionario, float ref_salario) {
    printf("NÚMERO DE INSCRIÇÃO: %d\t NOME: %s\n", funcionario.inscricao, funcionario.nome);
    float horaNormal, horaExtra;
    switch (funcionario.classe) {
        case 1:
            horaNormal = funcionario.horas * ref_salario * 1.3;
            horaExtra = funcionario.horas * ref_salario * 1.69;
            break;
        case 2:
            horaNormal = funcionario.horas * ref_salario * 1.9;
            horaExtra = funcionario.horas * ref_salario * 2.47;
            break;
        default:
            horaNormal = funcionario.horas * ref_salario;
            horaNormal = funcionario.horas * ref_salario * 1.3;
            break;
    }
    float salarioBruto = horaNormal + horaExtra;
    float deducao = salarioBruto * 0.11;
    printf("SALÁRIO HORAS NORMAIS: %.2f\n", horaNormal);
    printf("SALÁRIO HORAS EXTRAS: %.2f\n", horaExtra);
    printf("DEDUÇÃO INSS: %.2f\n", deducao);
    printf("SALARIO LIQUIDO: %.2f\n", salarioBruto - deducao);
    printf("\n");
}

void main() {
    int qtd;
    float ref_salario;
    printf("Informe a quantidade de funcionarios: ");
    while (scanf("%d", &qtd) != 1 || qtd <= 0) {
        printf("Entrada inválida! Por favor, digite um número inteiro maior que 0: ");
        
        int c;
        while ((c = getchar()) != '\n' && c != EOF); 
    }
    printf("Informe o sálario de referencia: ");
    scanf("%f", &ref_salario);

    Empregado *empregados = (Empregado *) calloc(qtd, sizeof(Empregado));

    int inscricao, classe; 
    char nome[51];
    float horas, extras;

    for (int i = 0; i < qtd; i++) {
        while (getchar() != '\n');
        printf("Informe o nome do %d° funcionario: ", i + 1);
        fgets(nome, 51, stdin);
        nome[strcspn(nome, "\n")] = '\0';
        printf("Informe o número de incrição do \"%s\": ", nome);
        scanf("%d", &inscricao);
        printf("Informe a classe de trabalho do \"%s\": ", nome);
        scanf("%d", &classe);
        printf("Informe a quantidade de horas trabalhadas por \"%s\": ", nome);
        scanf("%f", &horas);
        printf("Informe a quantidade de horas extras trabalhadas por \"%s\": ", nome);
        scanf("%f", &extras);

        empregados[i] = cadastrarEmpregado(inscricao, nome, classe, horas, extras);
    }

    printf("\n\n\n");

    for (int i = 0; i < qtd; i++) {
        imprimirEmpregado(empregados[i], ref_salario);
    }
}