package folienExamples;

import java.util.Arrays;

public class ReferencePlayground {

    public static void main(String[] args) {
        int[] array1 = new int[]{7, 8};
        int[] array2 = array1;

        System.out.println("Meine Arrays:");
        System.out.println("Array1[0]: " + array1[0]);
        System.out.println("Array1[1]: " + array1[1]);
        System.out.println("Array2[0]: " + array2[0]);
        System.out.println("Array2[1]: " + array2[1]);

        System.out.println("--------------------------------");
        array2[0] = 4;
        System.out.println("Meine Arrays nach array2[0] = 4:");
        System.out.println("Array1[0]: " + array1[0]);
        System.out.println("Array1[1]: " + array1[1]);
        System.out.println("Array2[0]: " + array2[0]);
        System.out.println("Array2[1]: " + array2[1]);
    }

}
