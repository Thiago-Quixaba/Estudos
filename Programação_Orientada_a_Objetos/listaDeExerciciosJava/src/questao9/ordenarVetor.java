package questao9;
// Escreva uma classe em java que receba um vetor com 10 valores inteiros e ordene os mesmo em ordem crescente.

public class ordenarVetor {
    public static int[] ordenarVetor(int[] numeros) {
        int aux;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (numeros[i] < numeros[j]) {
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        return numeros;
    }
}
