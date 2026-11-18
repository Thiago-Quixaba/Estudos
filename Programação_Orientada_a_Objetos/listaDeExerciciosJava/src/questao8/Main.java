package questao8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.print("Digite 10 número inteiros: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = input.nextInt();
        }

        System.out.printf("Moda: %d\n", Estatistica.moda(numeros, 10));
        System.out.printf("Mediana: %f\n", Estatistica.mediana(numeros, 10));
        System.out.printf("Media: %f\n", Estatistica.media(numeros, 10));

        input.close();
    }
}
