package questao10;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana", 25, "Feminino", 1500, "89999999999");
        Cliente cliente2 = new Cliente("Carlos", 32, "Masculino", 0, "89988888888");

        Gerente gerente = new Gerente("Mariana", 35, "Feminino", 7500, "G001", "Financeiro");

        Vendedor vendedor1 = new Vendedor("João", 28, "Masculino", 2500, "V001", "Eletrônicos", 12000);
        Vendedor vendedor2 = new Vendedor("Pedro", 30, "Masculino", 2800, "V002", "Móveis", 18000);

        System.out.println("===== CLIENTES =====");

        System.out.println("\n--- CLIENTE 1 ---");
        System.out.println(cliente1);

        System.out.println("\n--- CLIENTE 2 ---");
        System.out.println(cliente2);

        System.out.println("\n===== GERENTE =====");
        System.out.println(gerente);

        System.out.println("\n===== VENDEDORES =====");

        System.out.println("\n--- VENDEDOR 1 ---");
        System.out.println(vendedor1);

        System.out.println("\n--- VENDEDOR 2 ---");
        System.out.println(vendedor2);
    }
}