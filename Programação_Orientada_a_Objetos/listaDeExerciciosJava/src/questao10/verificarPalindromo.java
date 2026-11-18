package questao10;

import java.util.HashMap;
import java.util.Map;

public class verificarPalindromo {
    public static boolean verificarPalindromo(String palavraA, String palavraB) {
        if (palavraA.length() != palavraB.length()) {
            return false;
        } else {
            Map<Character, Integer> countA = new HashMap<>();
            Map<Character, Integer> countB = new HashMap<>();

            for (int i = 0; i < palavraA.length(); i++) {
                char caractereA = palavraA.charAt(i), caractereB = palavraB.charAt(i);
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

            if (countA.equals(countB)) {
                return true;
            } else {
                return false;
            }
        }
    }
}