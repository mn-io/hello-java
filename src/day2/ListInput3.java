package day2;

import java.util.ArrayList;

public class ListInput3 {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<String>();

        String lastInput;
        do {
            lastInput = ListInput.readInput("Bitte etwas Eingaben (Leere Eingabe=Ende): ");
            if(!lastInput.isEmpty()) {
                input.add(lastInput);
            }
        } while (!lastInput.isEmpty());

        System.out.println("Eingegeben wurde: " + input);
    }
}
