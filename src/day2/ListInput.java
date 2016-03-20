package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ListInput {
    public static void main(String[] args) {
        String input = "";
        String lastInput;

        do {
            lastInput = readInput("Bitte etwas Eingaben (Leere Eingabe=Ende): ");
            input += lastInput + ", ";
        } while (!lastInput.isEmpty());

        System.out.println("Eingegeben wurde: " + input);
    }

    public static String readInput(String query) {
        String input = "";

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print(query);

        try {
            input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return input;
    }
}
