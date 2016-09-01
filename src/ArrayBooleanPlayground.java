/**
 * Created by m on 9/1/16.
 */
public class ArrayBooleanPlayground {


    public static void main(String[] args) {
        boolean[] b = new boolean[] {true, true, true, false, true};

        boolean result = testTrue(b);
        System.out.println(result);
    }


    public static boolean testTrue(boolean[] telefonbuch) {
        boolean result = true;
        for (int positionImArray = 0; positionImArray < telefonbuch.length; positionImArray++) {
            boolean eintrag = telefonbuch[positionImArray];
            if(!eintrag) { // eintrag == false
                result = false;
                break;
            }
        }

        return result;
    }


}
