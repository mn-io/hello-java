package folienExamples;

public class NumbersPlayground {

    public static void main(String[] args) {

        int i = 0;
        while(i < 10) { // for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            if(i % 3 == 0) {
                System.out.print(".");
            } else if(i % 2 == 0) {
                System.out.print("#");
            } else {
                System.out.print("!");
            }
            System.out.println();
            i++;
        }
    }

}
