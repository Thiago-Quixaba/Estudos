package questao8;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("===== CADASTRO DE FATURA =====");

        System.out.print("Código: ");
        String codigo = input.nextLine();

        System.out.print("Descrição: ");
        String descricao = input.nextLine();

        System.out.print("Quantidade de itens: ");
        int quantidade = input.nextInt();

        System.out.print("Preço por item: R$ ");
        double preco = input.nextDouble();

        Fatura fatura = new Fatura(codigo, descricao, quantidade, preco);

        System.out.println("\n===== DADOS DA FATURA =====");
        System.out.println(fatura);

        System.out.println("\n===== TESTE DOS SUPPLIERS =====");
        System.out.println("Código: " + fatura.codigo.get());
        System.out.println("Descrição: " + fatura.descricao.get());
        System.out.println("Quantidade: " + fatura.quantidadeItensComprados.get());
        System.out.printf("Preço por item: R$ %.2f\n", fatura.precoPorItem.get());
        System.out.printf("Total: R$ %.2f\n", fatura.getTotalFatura());

        input.close();
    }
}