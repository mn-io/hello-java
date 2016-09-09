package live2;

/**
 * Created by m on 9/9/16.
 */
public class MyPlayground {

    public static void main(String[] args) {
        System.out.println("Es geht los:");

        House htw = new House();
        htw.number = 2;
        htw.color = "green";
        System.out.println("htw: " + htw);
        System.out.println(htw.number);
        System.out.println(htw.getHouseNumber());
        System.out.println(htw.color);

        System.out.println("------------------");
        House home = new House();
        home.number = 1;
        home.color = new String("blau");
        System.out.println("home: " + home);
        System.out.println(home.number);
        System.out.println(home.getHouseNumber());
        System.out.println(home.color);

        System.out.println("/////");
        House.whatIsClassScale();
        home.getHouseNumber();
        // aber nicht: House.getHouseNumber();
    }
}
