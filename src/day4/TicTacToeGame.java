package day4;

public class TicTacToeGame {

    final String[] GAME_TOKEN = new String[]{"x", "o"};

    private String[][] field;
    private int currentGamer;
    private String currentToken;

    public TicTacToeGame() {
        init();
        selectNextPlayer();
    }

    public void start() {
        boolean isPlaying = true;

        while (isPlaying) {

            printField();

            boolean wantsToContinuePlaying = askForAndSetCoordinates();
            if (!wantsToContinuePlaying) {
                return;
            }

            boolean hasWon = checkWin();
            if (hasWon) {
                printField();
                System.out.printf("Spieler %d hat gewonnen.%n", currentGamer);
                return;
            }

            selectNextPlayer();
        }
    }

    void init() {
        this.field = new String[3][3];
        this.currentGamer = 0;

        for (int i = 0; i < field.length; i++) {
            String[] row = field[i];
            for (int j = 0; j < row.length; j++) {
                row[j] = "_";
            }
        }
    }

    public void printField() {
        System.out.print("   ");
        for (int i = 0; i < field.length; i++) {
            int index = i + 1;
            System.out.print(index + " ");
        }
        System.out.println("\n  ------");

        for (int i = 0; i < field.length; i++) {
            String[] row = field[i];
            int index = i + 1;
            System.out.print(index + "| ");
            for (int j = 0; j < row.length; j++) {
                String cell = row[j];
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    boolean askForAndSetCoordinates() {
        String query = String.format("Spieler %d (%s) Feld-Koordinaten (Zeile Reihe): ", currentGamer, currentToken);

        do {
            String input = day2.ListInput.readInput(query);
            if (input.isEmpty()) {
                return false;
            }
            try {
                String[] split = input.split(" ");
                int row = Integer.parseInt(split[0]) - 1;
                int column = Integer.parseInt(split[1]) - 1;
                if (field[row][column].equals("_")) {
                    field[row][column] = currentToken;
                    return true;
                } else {
                    System.out.println("Feld bereits besetzt.");
                }

            } catch (Exception e) {
                System.out.println("Koordinaten nicht erkannt.");
            }
        } while (true);
    }

    boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRow(i)) {
                return true;
            }
            if (checkColumn(i)) {
                return true;
            }
        }

        if (checkDiagonal()) {
            return true;
        }


        return false;
    }

    boolean checkDiagonal() {
        if (!field[1][1].equals(currentToken)) {
            return false;
        }

        if (field[0][0].equals(currentToken) && field[2][2].equals(currentToken)) {
            return true;
        }

        if (field[0][2].equals(currentToken) && field[0][2].equals(currentToken)) {
            return true;
        }

        return false;
    }

    boolean checkColumn(int column) {
        for (int row = 0; row < field.length; row++) {
            if (!field[row][column].equals(currentToken)) {
                return false;
            }
        }
        return true;
    }

    boolean checkRow(int row) {
        for (int column = 0; column < field[row].length; column++) {
            if (!field[row][column].equals(currentToken)) {
                return false;
            }
        }
        return true;
    }

    void setField(int row, int column) {
        // only for testing.
        field[row][column] = currentToken;
    }

    void selectNextPlayer() {
        if (currentGamer == 0) {
            currentGamer = 1;
        } else if (currentGamer == 1) {
            currentGamer = 0;
        }
        this.currentToken = GAME_TOKEN[currentGamer];
    }
}
