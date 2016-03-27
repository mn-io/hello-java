package helpers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {

    public static String readInputNonEmpty(String query) {
        String input = "";
        do {
            input = readInput(query);
            if (!input.isEmpty()) {
                return input;
            }
            System.out.print("Eingabe war leer. ");
        } while (true);
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

    public static int readInt(String query) {
        String input = "";
        do {
            input = readInput(query);
            try {
                if (!input.isEmpty()) {
                    return Integer.parseInt(input);
                }
            } catch (NumberFormatException e) {

            }
            System.out.print("Eingabe war ungültig. ");
        } while (true);
    }
}
