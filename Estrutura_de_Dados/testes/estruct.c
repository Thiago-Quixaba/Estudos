#include <stdio.h>
#include <stdlib.h>

struct lista {
    int item;
    struct lista* next;
    struct lista* prev;
};

typedef struct lista Lista;

void addLista(Lista** atual, int newItem) {
    Lista* novoItem = (Lista*) calloc(1, sizeof(Lista));

    novoItem->item = newItem;
    novoItem->next = *atual;
    if (*atual != NULL) { novoItem->next->prev = novoItem; }

    *atual = novoItem;
}

void nextLista(Lista** atual) {
    if ((*atual)->next != NULL) { *atual = (*atual)->next; }
}

void prevLista(Lista** atual) {
    if ((*atual)->prev != NULL) { *atual = (*atual)->prev; }
}

void main() {
    Lista* navegador = NULL;

    addLista(&navegador, 10); 
    addLista(&navegador, 20);
    addLista(&navegador, 30); 
    printf("Item inicial: %d\n", navegador->item);

    nextLista(&navegador);
    printf("Avancei 1 vez: %d\n", navegador->item); 

    nextLista(&navegador);
    printf("Avancei mais 1 vez: %d\n", navegador->item); 

    prevLista(&navegador);
    printf("Voltei 1 vez: %d\n", navegador->item); 

}