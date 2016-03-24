/**
 * Created by m on 3/24/16.
 */
public class MyCalculatorPlayground {
    public static void main(String[] args) {
        Calculator3 calc = new Calculator3();
        calc.add(5, 7);
        calc.add(12, 7);
        float result = calc.getLastResult();
        System.out.println("Calc: " + result);


        Calculator3 calc2 = new Calculator3();
        calc2.subtract(22,21);
        float result2 = calc2.getLastResult();
        System.out.println("Calc2: " + result2);

        System.out.println("---------");
        float result3 = calc.getLastResult();
        System.out.println("Calc: " + result3);

    }
}
