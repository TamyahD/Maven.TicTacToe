package rocks.zipcodewilmington.tictactoe;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Character[][] board = {
                {'_', '|', '_', '|', '_'},
                {'_', '|', '_', '|', '_'},
                {'_', '|', '_', '|', '_'}};
        Board gameBoard = new Board(board);


        displayGameBoard(board);

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter position you wish to place (1-9): ");
            int pos = sc.nextInt();
            System.out.println("Position " + pos);

            positionPlacement(board, pos, "user");

            Random r = new Random();
            int cpuPosition = r.nextInt(9) +1;
            positionPlacement(board, cpuPosition, "");
        }
    }

    static void displayGameBoard(Character[][] board) {
        for (Character[] row : board) {
            for (Character ch : row) {
                System.out.print(ch);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }


    static void positionPlacement(Character[][] board, int position, String user) {
        char symbol;
        if (user.equals("user")) {
            symbol = 'X';
        } else {
            symbol = 'O';
        }


        switch (position) {
            case 1:
                board[0][0] = symbol;
                break;
            case 2:
                board[0][2] = symbol;
                break;
            case 3:
                board[0][4] = symbol;
                break;
            case 4:
                board[1][0] = symbol;
                break;
            case 5:
                board[1][2] = symbol;
                break;
            case 6:
                board[1][4] = symbol;
                break;
            case 7:
                board[2][0] = symbol;
                break;

            case 8:
                board[2][2] = symbol;
                break;

            case 9:
                board[2][4] = symbol;
                break;
            default:
                break;
        }
        displayGameBoard(board);
        System.out.println("\n\n");
    }
}
