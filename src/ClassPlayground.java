public class ClassPlayground {

    public static void main(String[] args) {
        House house1 = new House();
        house1.color = "Blau";
        house1.number = 1;

        House house2 = new House();
        house2.color = "Rot";
        house2.number = 2;

        System.out.println("Meine Häuser: ");
        System.out.println(house1.toString());
        System.out.println(house2.toString());

        System.out.println("Was passiert mit Haus 1?");
        house1 = house2;
        System.out.println(house1.toString());
        System.out.println(house2.toString());

    }
}
