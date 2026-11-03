package questao1;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        double[] lados = new double[3];
        int i = 0;

        for (char letra = 'A'; letra <= 'C'; letra++) {
            System.out.printf("Inserir valor de lado %c: ", letra);
            lados[i++] = input.nextDouble();
        }

        System.out.printf("%s", ((lados[0] + lados[1] > lados[2] ) && (lados[0] + lados[2] > lados[1] ) && (lados[1] + lados[2] > lados[0] )) ? "É um triângulo " + ((lados[0] == lados[1] && lados[1] == lados[2]) ? "equilátero\n" : (lados[0] != lados[1] && lados[1] != lados[2] && lados[2] != lados[0]) ? "escaleno\n" : "isósceles\n") : "Não é um triângulo!");
        input.close();
    }
}