package folienExamples;

public class HelloExtended {

    public static void main(String[] args) {
        String hi = "Hello World";
        System.out.println(hi);
        int i = 1 + 2;
        myFunction(i);
    }

    public static void myFunction(int i) {
        System.out.println("i ist: " + i);
    }
}
