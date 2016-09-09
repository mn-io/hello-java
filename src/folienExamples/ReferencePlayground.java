package folienExamples;

import java.util.Arrays;

public class ReferencePlayground {

    public static void main(String[] args) {
        int[] buchA = new int[]{7, 8};
        int[] buchB = buchA;

        System.out.println("Meine Arrays:");
        System.out.println("BuchA[0]: " + buchA[0]);
        System.out.println("BuchA[1]: " + buchA[1]);

        System.out.println("BuchB[0]: " + buchB[0]);
        System.out.println("BuchB[1]: " + buchB[1]);

        System.out.println("--------------------------------");
        changeValue(buchB);

        System.out.println("Meine Arrays nach buchB[0] = 4:");
        System.out.println("BuchA[0]: " + buchA[0]);
        System.out.println("BuchA[1]: " + buchA[1]);

        System.out.println("BuchB[0]: " + buchB[0]);
        System.out.println("BuchB[1]: " + buchB[1]);
    }

    public static void changeValue(int[] irgendwasMitBuch) {
        irgendwasMitBuch = new int[]{3, 6};
        irgendwasMitBuch[0] = 4;
    }

}
