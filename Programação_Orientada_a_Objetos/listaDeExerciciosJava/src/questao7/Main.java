package questao7;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número A: ");
        String numA = input.nextLine();
        System.out.print("Informe o número B: ");
        String numB = input.nextLine();
        
        if (numA.length() != numB.length()) {
            System.out.println("A não é permutação de B");
        } else {
            Map<Character, Integer> countA = new HashMap<>();
            Map<Character, Integer> countB = new HashMap<>();

            for (int i = 0; i < numA.length(); i++) {
                char caractereA = numA.charAt(i), caractereB = numB.charAt(i);
                if ( Character.isDigit(caractereA) && Character.isDigit(caractereB)) {
                    if (countA.containsKey(caractereA)) {
                        countA.put(caractereA, countA.get(caractereA) + 1);
                    } else {
                        countA.put(caractereA, 1);
                    }
                    if (countB.containsKey(caractereB)) {
                        countB.put(caractereB, countB.get(caractereB) + 1);
                    } else {
                        countB.put(caractereB, 1);
                    }
                }
            }

            if (countA.equals(countB)) {
                System.out.println("A é permutação de B");
            } else {
                System.out.println("A não é permutação de B");
            }
        }

        input.close();
    }
}
