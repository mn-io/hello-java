package day4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mario on 3/20/16.
 */
public class TicTacToeGameTest {

    @Test
    public void testCheckWinFails() throws Exception {
        TicTacToeGame game = new TicTacToeGame();

        game.printField();
        assertFalse(game.checkWin());
    }

    @Test
    public void testCheckWinDiagonal() throws Exception {
        TicTacToeGame game = new TicTacToeGame();
        game.setField(0, 0);
        game.setField(1, 1);
        game.setField(2, 2);

        game.printField();
        assertTrue(game.checkWin());
    }

    @Test
    public void testCheckWinDiagnoal2() throws Exception {
        TicTacToeGame game = new TicTacToeGame();
        game.selectNextPlayer();
        game.setField(0, 2);
        game.setField(1, 1);
        game.setField(2, 0);

        game.printField();
        assertTrue(game.checkWin());
    }

    @Test
    public void testCheckRow() throws Exception {
        TicTacToeGame game = new TicTacToeGame();
        game.setField(1, 0);
        game.setField(1, 1);
        game.setField(1, 2);

        game.printField();
        assertTrue(game.checkWin());
    }

    @Test
    public void testCheckColumn() throws Exception {
        TicTacToeGame game = new TicTacToeGame();
        game.setField(0, 1);
        game.setField(1, 1);
        game.setField(2, 1);

        game.printField();
        assertTrue(game.checkWin());
    }
}