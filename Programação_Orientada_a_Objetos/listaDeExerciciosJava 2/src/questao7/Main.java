package questao7;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        Forma[] formas = new Forma[3];
        String[] nomes = {"RETÂNGULO", "CÍRCULO", "QUADRADO"};

        System.out.println("===== RETÂNGULO =====");

        System.out.print("Lado: ");
        float lado = input.nextFloat();

        System.out.print("Altura: ");
        float altura = input.nextFloat();

        formas[0] = new Retangulo(lado, altura);

        System.out.println("\n===== CÍRCULO =====");

        System.out.print("Raio: ");
        float raio = input.nextFloat();

        formas[1] = new Circulo(raio);

        System.out.println("\n===== QUADRADO =====");

        System.out.print("Lado: ");
        float ladoQuadrado = input.nextFloat();

        formas[2] = new Quadrado(ladoQuadrado);

        System.out.println("\n===== RESULTADOS =====");

        for (int i = 0; i < formas.length; i++) {
            System.out.println("\n--- " + nomes[i] + " ---");
            System.out.printf("Área: %.2f\tPerímetro: %.2f\n", formas[i].CalculArea(), formas[i].CalcularPerimetro());
        }

        input.close();
    }
}