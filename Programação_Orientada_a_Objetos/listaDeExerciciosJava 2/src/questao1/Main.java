package questao1;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        ContaBancaria[] contas = {new ContaBancaria("", 0), new ContaBancaria("", 0)};

        for (ContaBancaria conta : contas) {
            System.out.print("Informe o nome do Titular: ");
            String nome = input.nextLine();
            System.out.print("Informe o Saldo disponivel na conta do " + nome + ": ");
            double saldo = input.nextDouble();
            input.nextLine();
            conta.setTitular(nome);
            conta.depositar(saldo);
            System.out.println("Cadastro FInalizado!\n");
        }

        for (ContaBancaria conta : contas) {
            System.out.print("Informe o novo nome do Titular da conta de " + conta.titular.get() + ": ");
            String nome = input.nextLine();
            conta.setTitular(nome);
            System.out.println("Ajuste FInalizado!\n");
        }

        for (ContaBancaria conta : contas) {
            System.out.print("Informe o valor a ser depositado na conta de " + conta.titular.get() + ": ");
            Double valor = input.nextDouble();
            conta.depositar(valor);
            System.out.println("Deposito Finalizado!\n");
        }

        for (ContaBancaria conta : contas) {
            System.out.print("Informe o valor a ser sacado da conta de " + conta.titular.get() + ": ");
            Double valor = input.nextDouble();
            conta.sacar(valor);
            System.out.println("Saque Finalizado!\n");
        }

        for (ContaBancaria conta : contas) {
            System.out.printf("TItular: %s\tSaldo: %.2f\n", conta.titular.get(), conta.saldo.get());
        }

        input.close();
    }
}