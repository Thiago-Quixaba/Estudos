package questao5;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o primeiro valor: ");
        Double num1 = input.nextDouble();
        input.nextLine();

        System.out.print("[ '+' -> Soma | '-' -> Subtração | '*' -> Multiplicação | '/' -> Divisão ]\nDigite a operação desejada: ");
        char op = input.next().charAt(0);

        switch (op) {
            case '+':
                System.out.print("Digite o segundo valor: ");
                System.out.printf("Resultado: %f\n", num1 + input.nextDouble());
                break;
            case '-':
                System.out.print("Digite o segundo valor: ");
                System.out.printf("Resultado: %f\n", num1 - input.nextDouble());
                break;
            case '*':
                System.out.print("Digite o segundo valor: ");
                System.out.printf("Resultado: %f\n", num1 * input.nextDouble());
                break;
            case '/':
                System.out.print("Digite o segundo valor: ");
                Double num2 = input.nextDouble();
                if (num2 != 0) {
                    System.out.printf("Resultado: %f\n", num1 / num2);
                } else if (num1 != 0) {
                    System.err.println("[!] Resultado: Indefinido!");
                } else {
                    System.err.println("[!] Resultado: Indeterminado!");
                }
                break;
            default:
                System.err.println("[!] Operação invalida!");
                break;
        }

        input.close();
    }
}
