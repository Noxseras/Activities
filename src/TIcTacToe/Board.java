package TIcTacToe;

import java.util.Scanner;

public class Board {
    // Create an array to store each move of the play
    private static byte[] index(){
        return new byte[9];
    }
    // Display the grid
    public static void printGrid(){
        byte[] pos = index();
        System.out.printf("  %d | %d | %d \n", pos[0], pos[1], pos[2]);
        System.out.println(" ----------- ");
        System.out.printf("  %d | %d | %d \n", pos[3], pos[4], pos[5]);
        System.out.println(" -----------  ");
        System.out.printf("  %d | %d | %d \n", pos[6], pos[7], pos[8]);
    }

    // Take user's input
    private static byte input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number from 1-9: ");
        return scanner.nextByte();

        //do-while loop in case user does not enter number or types anything out of range
    }
    public static void out(){
        System.out.println(input());
    }
}
