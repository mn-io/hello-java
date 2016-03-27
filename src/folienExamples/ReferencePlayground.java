package folienExamples;

import java.util.Arrays;

public class ReferencePlayground {

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = array1;

        System.out.println("Meine Arrays:");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        array2[0] = 4;
        System.out.println("Meine Arrays nach array2[0] = 4:");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }

}
