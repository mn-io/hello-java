package live2;

/**
 * Created by m on 9/9/16.
 */
public class House {

    static int[] availableHouseNumbers = new int[]{66, 67, 68, 69};

    int number;
    String color;

    public int getHouseNumber() {
        return availableHouseNumbers[number];
    }

    public static void whatIsClassScale() {
        System.out.println("1:1000");
    }
}
