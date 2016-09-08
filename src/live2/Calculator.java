package live2;

import java.util.Scanner;

/**
 * Created by m on 9/6/16.
 */
public class Calculator {
    private static int multiply(int factor1, int factor2) {
        return factor1 * factor2;
    }

    public static void main(String[] args) {
//        final Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl a>");
        int a = 4;  //scanner.nextInt();

        System.out.println("Bitte Zahl b>");
        int b = 3;  //scanner.nextInt();

        System.out.println("Bitte Operator eingeben>");
        char operator = '/';  //scanner.next().charAt(0);

        ////////////////

        int result = 0;

        if(operator == '/') {
            result = divide(a,b);
        } else if(operator == '*') {
            result = multiply(a,b);
        } else {
            System.out.println("Unbekannter Operator");
            return;
        }

        System.out.println("Ergebnis:" + result);
    }

    public static int divide(int divisor, int dividend) {
        final int quotient = divisor / dividend;
        return quotient;
    }
}
