package folienExamples;

public class ArrayPlayground {

    public static void main(String[] args) {
        int[] coordinate = new int[]{0, 3, 1};
//        int[] point = new int[3];
//        point[0] =  3; ...
        printCoordinates(coordinate);
    }

    private static void printCoordinates(int[] p) {
        System.out.println("Coords:" + p[0] + "," + p[1] + "," + p[2]);
    }

}
