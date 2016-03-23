import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by m on 3/23/16.
 */
public class Input {
    public static void main(String[] args) {
        int i = 0;
        String[] savedInputs = new String[10];

        while(i < 10) {
            String input = readInput("Schreibe was: ");
            // speichere input mit neuem Index
            savedInputs[i] = input;

            if(input.isEmpty()) {
                System.out.println(Arrays.toString(savedInputs));
                return;
            }

            i++;
        }

        System.out.println(Arrays.toString(savedInputs));
    }

    public static String readInput(String query) {
        String input = "";
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print(query);

        try {
            input = br.readLine();
        } catch (Exception e) {
            input = "";
        }
        return input;
    }
}
