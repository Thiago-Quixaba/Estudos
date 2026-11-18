package questao6;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("===== ANIMAL =====");

        System.out.print("Nome: ");
        String nomeAnimal = input.nextLine();

        System.out.print("Peso: ");
        double pesoAnimal = input.nextDouble();
        input.nextLine();

        Animal animal = new Animal(nomeAnimal, pesoAnimal);

        System.out.println("===== PEIXE =====");

        System.out.print("Nome: ");
        String nomePeixe = input.nextLine();

        System.out.print("Peso: ");
        double pesoPeixe = input.nextDouble();
        input.nextLine();

        System.out.print("Habitat (Marinho, Água doce ou Ornamental): ");
        String habitat = input.nextLine();

        Peixe peixe = new Peixe(nomePeixe, pesoPeixe, habitat);

        System.out.println("\n===== CACHORRO =====");

        System.out.print("Nome: ");
        String nomeCachorro = input.nextLine();

        System.out.print("Peso: ");
        double pesoCachorro = input.nextDouble();
        input.nextLine();

        System.out.print("Raça: ");
        String raca = input.nextLine();

        System.out.print("Sexo: ");
        String sexo = input.nextLine();

        Cachorro cachorro = new Cachorro(nomeCachorro, pesoCachorro, raca, sexo);

        System.out.println("\n===== ANIMAIS CADASTRADOS =====");

        System.out.println("\n--- PEIXE ---");
        System.out.println(peixe);

        System.out.println("\n--- CACHORRO ---");
        System.out.println(cachorro);

        input.close();
    }
}