package TIcTacToe;

import java.util.Scanner;

public class Board {
    // Create an array to store each move of the play
    private static char[][] grid() {

        // Create a 3x3 array , character type.
        char[][] gameBoard = new char[3][3];

        // Fill the board now with dashes(A for loop for the rows and for the columns)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = '-';
            }
        }
        return gameBoard;
    }


    //Print out the grid
    public static char[][] printGrid() {

        //Create an array character to save the results of the grid method (save the dashes to a array variable to print)
        char[][] board = grid();

        // For every row character in the board array
        for (int i = 0; i < 3; i++) {

            // For every column in the board array
            for (int j = 0; j < 3; j++) {

                // Print(and not println) each row and column
                System.out.print(board[i][j]);
            }
            // Separate the lines from being added one under the other
            System.out.println();
        }
        return board;
    }

    // Check the range input then add it to the board
    public static void rules() {

        Scanner scan = new Scanner(System.in);

        boolean player1 = true;

        int row;
        int col;

        // Call the printGrid method then pass it to a new array
        char[][] grid = grid();

        char symbol = ' ';

        // If player1 is playing, then his/her turn add it as X else as O
        if (player1) {
            symbol = 'X';
        } else {
            symbol = 'O';
        }

        // Print which player's turn is
        if (player1) {
            System.out.println("Player's 1 turn - X player");
        } else {
            System.out.println("Player's 2 turn - O player");
        }

        // A while loop to check if the players are not selecting numbers out or range 1 to 3
        while (true) {

            //get row and column from user then remove 1 ( so when the player types 1, goes to 0)
            System.out.print("Enter row(1-3): ");
            row = scan.nextInt() - 1;
            System.out.print("Enter column(1-3): ");
            col = scan.nextInt() - 1;

            // check row and col if are correct and not out of range
            if (row < 0 || col < 0 || row > 3 || col > 3) {
                System.out.println("Out of index! PLease within a range of 1-3!");

                //check if the position is already filled
            } else if (grid[row][col] != '-') {
                System.out.println("Is already filled!Try somewhere else!");
                // If everything is alright, break from the while loop
            } else {
                break;
            }
        }
        // Assign the symbol if the specified row and column
        grid[row][col] = symbol;
        }
    }

