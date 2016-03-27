public class Calculator {

    public static void main(String[] args) {
        char operator = '/';

        int a = 5;
        int b = 3;
        float result = 0;

        switch (operator) {
            case '+':
                result = add(a, b);
                break;
            case '-':
                result = subtract(a, b);
                break;
            case '*':
                result = multiply(a, b);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Durch 0 teilen nicht erlaubt.");
                    return;
                }
                result = divide(a, b);
                break;
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

    public static int multiply(int first, int second) {
        return first * second;
    }

    public static float divide(float first, float second) {
        float quotient = first / second;
        return quotient;
    }
}
