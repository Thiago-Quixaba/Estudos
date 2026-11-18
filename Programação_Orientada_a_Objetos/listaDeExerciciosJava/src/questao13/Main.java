package questao13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 1000; i <= 9999; i++) {
            int num1 = i / 100, num2 = i % 100;
            if (Math.pow(num1 + num2, 2) == i) {
                numeros.add(i);
            }
        }

        for (int numero : numeros) {
            System.out.printf("%d\n", numero);
        }
    }
}
