#include <stdio.h>
#include <string.h>

struct paciente {
    char nome[20];
    int idade;
    float altura, peso;
};

typedef struct paciente Paciente;

Paciente criarPaciente() {
    Paciente p;
    printf("Inserir Nome: ");
    scanf(" %s", &p.nome);
    printf("Inserir Idade: ");
    scanf("%d", &p.idade);
    printf("Inserir Altura: ");
    scanf("%f", &p.altura);
    printf("Inserir Peso: ");
    scanf("%f", &p.peso);

    return p;
}

void imprimir(Paciente p) {
    printf("O nome do paciente é \"%s\";\n", p.nome);
    printf("A idade do paciente é %d;\n", p.idade);
    printf("A altura do paciente é %.2f;\n", p.altura);
    printf("O peso do paciente é %.2f;\n", p.peso);
} 

void verIMC(Paciente p) {
    float imc = p.peso / p.altura;
    printf("O IMC do paciente é %.2f;\n", imc);
    if (imc < 18.5) {
        printf("O paciente está abaixo do peso\n");
    } else if (imc <= 24.9) {
        printf("O paciente está normal\n");
    } else if (imc <= 29.9) {
        printf("O paciente está acima do peso\n");
    } else {
        printf("O paciente está obeso\n");
    }
}

void main() {
    Paciente p = criarPaciente();

    verIMC(p);
}