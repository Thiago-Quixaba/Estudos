package questao5;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe o primeiro número: ");
        double a = input.nextDouble();

        System.out.print("Informe o segundo número: ");
        double b = input.nextDouble();


        System.out.println("\n===== CALCULADORA COMUM =====");

        System.out.printf("Soma: %f\n", Calculadora.soma(a, b));
        
        System.out.printf("Subtração: %f\n", Calculadora.subtracao(a, b));

        System.out.printf("Multiplicação: %f\n", Calculadora.multiplicacao(a, b));
        
        if (b != 0) {
            System.out.printf("Divisão: %f\n", Calculadora.divisao(a, b));
        } else {
            System.out.println("Divisão: Indefinida (divisão por zero)");
        }


        System.out.println("\n===== CALCULADORA CIENTÍFICA =====");

        System.out.printf("Soma: %f\n", CalculadoraCientifica.soma(a, b));

        System.out.printf("Subtração: %f\n", CalculadoraCientifica.subtracao(a, b));

        System.out.printf("Multiplicação: %f\n", CalculadoraCientifica.multiplicacao(a, b));

        if (b != 0) {
            System.out.printf("Divisão: %f\n", CalculadoraCientifica.divisao(a, b));
            System.out.printf("Radiciação: %f\n", CalculadoraCientifica.radiciacao(a, b));
        } else {
            System.out.println("Divisão: Indefinida (divisão por zero)");
            System.out.println("Radiciação: Índice da raiz não pode ser zero");
        }

        System.out.printf("Raiz quadrada: %f\n", CalculadoraCientifica.raizQuadrada(a));

        System.out.printf("Potenciação: %f\n", CalculadoraCientifica.potenciacao(a, b));
        

        input.close();
    }
}