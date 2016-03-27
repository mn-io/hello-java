package folienExamples;

public class FunctionPlayground {

    public static void main(String[] args) {
        int first = 1;
        int second = 2;
        int result = add(first, second);
        System.out.println(result);
    }

    public static int add(int a, int b) {
//        int localResult = a + b;
        return a + b;
    }

}
