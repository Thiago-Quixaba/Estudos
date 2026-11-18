package questao8;

import java.util.HashMap;
import java.util.Map;

public class Estatistica {
    public static Integer moda(int[] numeros, int n) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : numeros) {
            if (count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }

        Map.Entry<Integer, Integer> maiorValor = null;
        for (Map.Entry<Integer, Integer> valor : count.entrySet()) {
            if (maiorValor == null || maiorValor.getValue() < valor.getValue()) {
                maiorValor = valor;
            }
        }

        return maiorValor.getKey();
    }

    public static Double media(int[] numeros, int n) {
        Double soma = 0.0;

        for (int num : numeros) {
            soma += num;
        }


        return soma / n;
    }

    public static Double mediana(int[] numeros, int n) {
        int aux;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (numeros[i] < numeros[j] ){
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        return  n % 2 != 0 ? (double) numeros[n / 2] : (double) (numeros[n / 2 - 1] + numeros[n / 2]) / 2;
    }
}