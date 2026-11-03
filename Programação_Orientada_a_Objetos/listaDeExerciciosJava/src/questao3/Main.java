package questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira um valor binario: ");
        int numero = input.nextInt(), num, result = 0;

        if (numero == 0) {
            System.err.println("Equivalente em decimal: 0");
        } else {
            for (int i = 0; numero != 0; i++) {
                num = numero % 10;
                numero = numero / 10;

                if (num == 1 || num == -1) {
                    result += num * (int) Math.pow(2, i);
                } else if (num != 0) {
                    System.err.println("[!] Esse não é um número decimal valdo!");
                    break;
                } 

                if (numero == 0) {
                    System.err.println("Equivalente em decimal: " + result);
                    break;
                }
            }
        }
        
        input.close();
    }
}