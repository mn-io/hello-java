package live2;

/**
 * Created by m on 9/8/16.
 */
public class ArrayLoopPlayground {

    public static void main(String[] args) {


        int laenge = 10;
        boolean[] buchMitBooleans = new boolean[laenge];

        System.out.println("Berechnungen ab hier:");
        for (int i = 0; i < laenge; i++) {
            boolean isEven = i % 2 == 0;
            buchMitBooleans[i] = isEven;
        }


        System.out.println("//////////////////////////");
        System.out.println("Ausgabe ab hier:");
        for (int seitenZahl = 0; seitenZahl < laenge; seitenZahl++) {
            boolean aktuelleSeite = buchMitBooleans[seitenZahl];
            System.out.println("Seite " + seitenZahl + " sagt mir: " + aktuelleSeite);
        }



    }
}
