package TIcTacToe;

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
    public static void printGrid(){
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
    }
}