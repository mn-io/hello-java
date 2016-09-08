public class Calculator {

    public static void main(String[] args) {
        char operator = '/';

        int a = 5;
        int b = 3;
        float result = 0;

        if (operator == '+') {
            result = add(a, b);
        } else if (operator == '-') {
            result = subtract(a, b);
        } else if (operator == '*') {
            result = multiply(a, b);
        } else if (operator == '/') {
            if (b == 0) {
                System.out.println("Durch 0 teilen nicht erlaubt.");
                return;
            }
            result = divide(a, b);
        } else {
            System.out.println("Kenn ich nicht, mach ich nicht!");

        }

        System.out.println("Ergebnis: " + a + " " + operator + " " + b + " = " + result);
    }

    public static int add(int first, int second) {
        int sum = first + second;
        return sum;
    }

    public static int subtract(int first, int second) {
        return first - second;
    }

    public static int multiply(int factorOne, int factorTwo) {
        int result = factorOne * factorTwo;
        return result;
    }

    public static float divide(float first, float second) {
        float quotient = first / second;
        return quotient;
    }
}
