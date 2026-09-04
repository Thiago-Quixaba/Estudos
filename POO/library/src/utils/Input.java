package utils;

import java.util.Scanner;
import java.util.Locale;

public class Input {
    private static final Scanner scan = new Scanner(System.in);
    static {
        scan.useLocale(Locale.US);
    }

    public static String inputString(String text, Object... args) {
        System.out.printf(text, args);
        return scan.nextLine();
    }

    public static Integer inputInt(String text, Object... args) {
        System.out.printf(text, args);
        Integer value = scan.nextInt();
        scan.nextLine();
        return value;
    }

    public static Double inputDouble(String text, Object... args) {
        System.out.printf(text, args);
        Double value = scan.nextDouble();
        scan.nextLine();
        return value;
    }

    public static Float inputFloat(String text, Object... args) {
        System.out.printf(text, args);
        Float value = scan.nextFloat();
        scan.nextLine();
        return value;
    }

    public static Boolean inputBoolean(String text, Object... args) {
        System.out.printf(text, args);
        Boolean value = scan.nextBoolean();
        scan.nextLine();
        return value;
    }
}