package questao5;

public class CalculadoraCientifica extends Calculadora {
    public static double potenciacao(double a, double b) {
        return Math.pow(a, b);
    }

    public static double radiciacao(double a, double b) {
        return Math.pow(a, 1 / b);
    }

    public static double raiz_quadrada(double a) {
        return Math.sqrt(a);
    }
}