package rocks.zipcodewilmington.tictactoe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] board;
    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        return getWinner().equals("X");
    }

    public Boolean isInFavorOfO() {
        return getWinner().equals("O");
    }

    public Boolean isTie() {
        return getWinner().equals("");
    }

    public String getWinner() {
        List<String> boardChars = new ArrayList<>();

        boardChars.add(Character.toString(board[0][0]) +board[0][1] +board[0][2]);
        boardChars.add(Character.toString(board[1][0]) +board[1][1] +board[1][2]);
        boardChars.add(Character.toString(board[2][0]) +board[2][1] +board[2][2]);

        boardChars.add(Character.toString(board[0][0]) +board[1][0] +board[2][0]);
        boardChars.add(Character.toString(board[0][1]) +board[1][1] +board[2][1]);
        boardChars.add(Character.toString(board[0][2]) +board[1][2] +board[2][2]);

        boardChars.add(Character.toString(board[0][0]) +board[1][1] +board[2][2]);
        boardChars.add(Character.toString(board[2][0]) +board[1][1] +board[0][2]);


        if (boardChars.contains("XXX")) {
            return "X";
        }
        if (boardChars.contains("OOO")) {
            return "O";
        }
        return "";
    }

}
