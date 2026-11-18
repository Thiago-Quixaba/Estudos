package questao9;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("===== CADASTRO DO PRIMEIRO EMPREGADO =====");

        System.out.print("Nome: ");
        String nome1 = input.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome1 = input.nextLine();

        System.out.print("Salário mensal: R$ ");
        double salario1 = input.nextDouble();
        input.nextLine();

        Empregado empregado1 = new Empregado(nome1, sobrenome1, salario1);

        System.out.println("\n===== CADASTRO DO SEGUNDO EMPREGADO =====");

        System.out.print("Nome: ");
        String nome2 = input.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome2 = input.nextLine();

        System.out.print("Salário mensal: R$ ");
        double salario2 = input.nextDouble();

        Empregado empregado2 = new Empregado(nome2, sobrenome2, salario2);

        System.out.println("\n===== EMPREGADOS CADASTRADOS =====");

        System.out.println("\n--- EMPREGADO 1 ---");
        System.out.println(empregado1);

        System.out.println("\n--- EMPREGADO 2 ---");
        System.out.println(empregado2);

        System.out.println("\nQuantidade de empregados: " + Empregado.quantidadeEmpregados.get());

        input.close();
    }
}