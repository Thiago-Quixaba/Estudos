package questao4;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<AgendaEnderecos> agenda = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== AGENDA DE ENDEREÇOS =====");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("3 - Quantidade de cadastros");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = Integer.parseInt(input.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("\n--- NOVO CADASTRO ---");

                    System.out.print("Nome: ");
                    String nome = input.nextLine();

                    System.out.print("Telefone (11 dígitos): ");
                    String telefone = input.nextLine();

                    System.out.println("\n--- ANIVERSÁRIO ---");

                    System.out.print("Dia: ");
                    int dia = Integer.parseInt(input.nextLine());

                    System.out.print("Mês: ");
                    int mes = Integer.parseInt(input.nextLine());

                    System.out.print("Ano: ");
                    int ano = Integer.parseInt(input.nextLine());

                    Data aniversario = new Data(dia, mes, ano);

                    System.out.println("\n--- ENDEREÇO ---");

                    System.out.print("Estado: ");
                    String estado = input.nextLine();

                    System.out.print("Cidade: ");
                    String cidade = input.nextLine();

                    System.out.print("Bairro: ");
                    String bairro = input.nextLine();

                    System.out.print("Rua: ");
                    String rua = input.nextLine();

                    System.out.print("Número: ");
                    int numero = Integer.parseInt(input.nextLine());

                    Endereco endereco = new Endereco(
                        estado, cidade, bairro, rua, numero
                    );

                    AgendaEnderecos pessoa = new AgendaEnderecos(
                        nome, telefone, aniversario, endereco
                    );

                    agenda.add(pessoa);

                    System.out.println("\nCadastro realizado!");
                    break;

                case 2:
                    if (agenda.isEmpty()) {
                        System.out.println("\nNenhuma pessoa cadastrada.");
                        break;
                    }

                    System.out.println("\n===== PESSOAS CADASTRADAS =====");

                    for (int i = 0; i < agenda.size(); i++) {
                        AgendaEnderecos pessoaAtual = agenda.get(i);

                        System.out.println("\nCadastro #" + (i + 1));
                        System.out.println("Nome: " + pessoaAtual.nome.get());
                        System.out.println("Telefone: " + pessoaAtual.telefone.get());
                        System.out.println("Aniversário: " + pessoaAtual.dataAniversario.get());
                        System.out.println("Endereço:\n" + pessoaAtual.endereco.get());
                    }
                    break;

                case 3:
                    System.out.println(
                        "\nTotal de cadastros: " +
                        AgendaEnderecos.quantidadeCadastros.get()
                    );
                    break;

                case 0:
                    System.out.println("\nEncerrando agenda...");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }

        } while (opcao != 0);

        input.close();
    }
}