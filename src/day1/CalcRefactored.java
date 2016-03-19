package day1;

public class CalcRefactored {
    public static void main(String... args) {
//        System.out.println(Arrays.toString(args));

        int number1 = Integer.parseInt(args[0]);
        String operator = args[1];
        int number2 = Integer.parseInt(args[2]);

        String result = getResult(number1, operator, number2);

        System.out.println("Ergebnis: " + result);
    }

    static String getResult(int number1, String operator, int number2) {
        boolean operatorZeroNotAllowed = operator.equals("/") || operator.equals("%");
        if (number2 == 0 && operatorZeroNotAllowed) {
            return "Division durch 0 nicht erlaubt";
        }

        int result;
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
        } else {
            return "Operator nicht gefunden";
        }

        return String.valueOf(result);

    }
}
