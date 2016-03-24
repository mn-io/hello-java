/**
 * Created by m on 3/23/16.
 */
public class Calculator3 {

    private float result;

    public int add(int first, int second) {
        int sum = first + second;
        this.result = sum;
        return sum;
    }

    public int subtract(int first, int second) {
        int difference = first - second;
        result = difference;
        return difference;
    }

    public int multiply(int first, int second) {
        int product = first * second;
        result = product;
        return product;
    }

    public float divide(float first, float second) {
        float quotient = first / second;
        result = quotient;
        return quotient;
    }

    public float getLastResult() {
        return result;
    }
}
