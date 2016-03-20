package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class ListInput2 {
    public static void main(String[] args) {
        String[] input = new String[10];
        int index = 0;

        String lastInput;
        do {
            lastInput = ListInput.readInput("Bitte etwas Eingaben (Leere Eingabe=Ende): ");
            if(!lastInput.isEmpty()) {
                input[index] = lastInput;
            }
            index++;
        } while (!lastInput.isEmpty());

        System.out.println("Eingegeben wurde: " + Arrays.toString(input));
    }
}
