package questao14;

import java.util.Scanner;

public class Main {
    public static int mdc(int x, int y) {
        if (x == y) {
            return x;
        } else if (x > y) {
            return mdc(x - y, y);
        } else {
            return mdc(y, x);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um valor inteiro positivo: ");
        int x = input.nextInt();
        System.out.print("Informe outro valor inteiro positivo: ");
        int y = input.nextInt();

        System.out.printf("%d\n", mdc(x, y));

        input.close();
    }
}