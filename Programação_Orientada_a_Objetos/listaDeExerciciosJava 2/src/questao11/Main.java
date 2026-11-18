package questao11;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Volkswagen", 4, 5, "Gol", 0, true);

        Bicicleta bicicleta = new Bicicleta("Caloi", 21, "Elite", 0, 17);

        Automovel automovel = new Automovel("Toyota", 4, 6, "Corolla", 0, 150, 5);

        Carro carro = new Carro("Honda", 4, 6, "Civic", 0, 4, "Sedan");

        Caminhao caminhao = new Caminhao("Volvo", 10, 12, "FH", 0, 5, 30000);

        veiculo.acelerar(80);
        veiculo.subtrair(30);

        bicicleta.acelerar(25);
        automovel.acelerar(100);
        carro.acelerar(90);
        caminhao.acelerar(60);

        System.out.println("===== VEÍCULO =====");
        veiculo.imprimirInformacoes();

        System.out.println("\n===== BICICLETA =====");
        bicicleta.imprimirInformacoes();

        System.out.println("\n===== AUTOMÓVEL =====");
        automovel.imprimirInformacoes();

        System.out.println("\n===== CARRO =====");
        carro.imprimirInformacoes();

        System.out.println("\n===== CAMINHÃO =====");
        caminhao.imprimirInformacoes();
    }
}