package questao12;

public class Main {
    public static void main(String[] args) {
        double A = 0, x = 1;
        double B = 0, y = 50;
        double C = 0;

        for (int i = 1; i <= 50; i++) {
            A += x / i;
            x += 2;

            B += Math.pow(2, i) / y;
            y--;

            if (i <= 10) {
                C += i % 2 != 0 ? (double) i / (i * i) : (double) -i / (i * i); 
            }
        }
        
        System.out.println("S1 = " + A);
        System.out.println("S2 = " + B);
        System.out.println("S3 = " + C); 
    }
}
