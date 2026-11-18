package questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma data (dd mm aa): ");
        Data data = new Data(input.nextInt(), input.nextInt(), input.nextInt());
        data.imprimirData();

        input.close();
    }
}
