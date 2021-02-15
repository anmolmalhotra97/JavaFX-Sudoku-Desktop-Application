package sudoku.problemdomain;

import sudoku.computationallogic.SudokuUtilities;
import sudoku.constants.GameState;

import java.io.Serializable;

public class SudokuGame implements Serializable {

    private final GameState gameState;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY = 9;

    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getCopyOfGridState() {
        // in order to make this sudoku grid state to be immutable so that sudoku object isn't messed with over time
        return SudokuUtilities.copyToNewArray(gridState);
    }
}
