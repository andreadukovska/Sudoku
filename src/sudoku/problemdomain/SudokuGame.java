package sudoku.problemdomain;

import sudoku.computationlogic.SudokuUtilities;
import sudoku.constants.GameState;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    private final GameState gameState;
    private final int[][] gridState;
    /** gameState initial potetntial states of the game are ENUM*/
    /** gridState is the State of the game. IF certain
     conditions are met, GameLogic must change gameState
     For example gridState[3,9] third from the left, bottom row*/

    public static final int GRID_BOUNDARY = 9; //constant

    public SudokuGame (GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    //returnung copy of the grid State
    public int[][] getCopyOfGridState() {
        return SudokuUtilities.copyToNewArray(gridState) ;
    }
}
