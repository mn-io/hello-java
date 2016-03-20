package day1;

public class Calc {
    public static void main(String... args) {
//        System.out.println(Arrays.toString(args));

        int number1 = Integer.parseInt(args[0]);
        String operator = args[1];
        int number2 = Integer.parseInt(args[2]);

        int result = 0;
        if (operator.equals("-")) {
            result = number1 - number2;
        } else if (operator.equals("+")) {
            result = number1 + number2;
        } else if (operator.equals("/")) {
            result = number1 / number2;
        } else if (operator.equals("*")) {
            result = number1 * number2;
        } else if (operator.equals("%")) {
            result = number1 % number2;
        }

        System.out.println("Ergebnis: " + result);
    }
}
