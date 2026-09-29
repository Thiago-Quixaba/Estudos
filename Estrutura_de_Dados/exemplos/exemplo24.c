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

void main() {
    Paciente pacientes[10];
    for (int i = 0; i < 10; i++) {
        pacientes[i] = criarPaciente();
        printf("\n");
        imprimir(pacientes[0]);
        printf("\n");
    }
    for (int i = 0; i < 10; i++) {
        
    }
}