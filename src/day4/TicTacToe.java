package day4;

public class TicTacToe {

    static String[][] field = new String[3][3];

    public static void main(String[] args) {
        initField();

        String lastInput;
        do {
            lastInput = day2.ListInput.readInput("Spieler 1 (x) Feld-Koordinaten: ");
            try {
                String[] split = lastInput.split(" ");
                int row = Integer.parseInt(split[0]) - 1;
                int column = Integer.parseInt(split[1]) - 1;

                field[row][column] = "x";
            } catch (Exception e) {
                if (!lastInput.isEmpty()) {
                    System.out.println("Koordinaten nicht erkannt.");

                }
            }
        } while (!lastInput.isEmpty());

        printField();
    }

    private static void initField() {
        for (int i = 0; i < field.length; i++) {
            String[] row = field[i];
            for (int j = 0; j < row.length; j++) {
                row[j] = "_";
            }
        }
    }

    public static void printField() {
        for (int i = 0; i < field.length; i++) {
            String[] row = field[i];
            for (int j = 0; j < row.length; j++) {
                String cell = row[j];
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
