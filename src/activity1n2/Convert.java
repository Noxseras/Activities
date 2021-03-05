package activity1n2;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Please enter the temperature in Fahrenheit to convert: ");
    float userInput = keyboard.nextInt();

    //Calculate the numbers with tis formula: (32°F − 32) × 5/9
    float celsius = (userInput - 32) * 5/9;

    //Display results
    System.out.println(userInput + " F equals to " + celsius + " C");
    }
}

