package day1;

public class HelloArgs {
    public static void main(String... args) {
        if (args.length == 0) {
            System.out.println("Es fehlt ein Argument.");
            return;
        }

        System.out.println("Hello " + args[0]);
    }
}
