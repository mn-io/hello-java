package live;

import java.util.Arrays;

/**
 * Created by m on 8/31/16.
 */
public class ArrayPlayground {
    public static void main(String[] args) {
        int arrayLength = 10;
        boolean[] results = new boolean[arrayLength];

        for (int derNameIstVollkommenEgalvonDieserVariable = 0; derNameIstVollkommenEgalvonDieserVariable < arrayLength; derNameIstVollkommenEgalvonDieserVariable++) {
            int modulo = derNameIstVollkommenEgalvonDieserVariable % 2;
            boolean isEven = modulo == 0;
            results[derNameIstVollkommenEgalvonDieserVariable] = isEven;
        }

        System.out.println("/////////////");

        for (int i = 0; i < arrayLength; i++) {
            boolean result = results[i];
            System.out.println(i + ": " + result);
        }
    }
}
