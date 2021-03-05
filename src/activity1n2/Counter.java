package activity1n2;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        // Ask user for a string
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Type something to find the vowels: ");

        String text = keyboard.nextLine();

        int vowels = 0;
        // split and check every letter in the string for vowels
        for(int i = 0; i < text.length(); ++i){
            // Separate each letter
            char letters = text.charAt(i);
            if(letters == 'a' || letters == 'e' || letters == 'i' || letters == 'o' || letters == 'u'){
                ++vowels;
            }
        }
        // Print the sum of the vowels that are in the string
        System.out.println("There are: " + vowels + " vowels");
    }
}