/**
 * Created by m on 3/23/16.
 */
public class Calculator2 {
    public static void main(String[] args) {
        char operator = '*';

        int first = 5;
        int second = 3;
        float result = 0;

        if(operator == '*') {
            int product = multiply(first, second);
            result = product;
        } else if (operator == '/') {
            float quotient = divide(first, second);
            result = quotient;
        } else if(operator == '+') {
            int sum = add(first, second);
            result = sum;
        } else if(operator == '-') {
            int difference = subtract(first, second);
            result = difference;
        } else {
            System.out.println("Unknown operator.");
            return;
        }

        System.out.println("Ergebnis: " + result);
    }

    public static int add(int first, int second) {
        int sum = first + second;
        return sum;
    }

    public static int subtract(int first, int second) {
        return first - second;
    }

    public static int multiply(int first, int second) {
        return first * second;
    }

    public static float divide(float first, float second) {
        float quotient = first / second;
        return quotient;
    }
}
