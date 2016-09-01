package live;

import helpers.Input;

/**
 * Created by m on 8/30/16.
 */
public class Calculator {
    public static void main(String[] args) {
        String operator = Input.readInputNonEmpty("Operator eingeben:");
        int a = Input.readInt("a:");
        int b = Input.readInt("b:");

        float result = 0;
        if (operator.equals("+")) {
            result = add(a, b);
        } else if (operator.equals("/")) {
            result = divide(a, b);
        } else if (operator.equals("*")) {
        } else if (operator.equals("-")) {
        } else if (operator.equals("%")) {
        } else {
            System.out.println("kein Operator");
            return;
        }

        System.out.println(a + " " + operator + " " + b + " = " + result);
    }

    public static int add(int first, int second) {
        return first + second;
    }

    public static float divide(float hans, float franz) {
        return hans / franz;
    }
}
