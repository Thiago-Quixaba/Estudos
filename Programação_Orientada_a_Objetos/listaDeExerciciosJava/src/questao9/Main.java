package questao9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.print("Digite 10 número inteiros: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = input.nextInt();
        }

        for (int num : ordenarVetor.ordenarVetor(numeros)) {
            System.out.printf("%d\t", num);
        }
        System.out.print(("\n"));

        input.close();
    }
}
