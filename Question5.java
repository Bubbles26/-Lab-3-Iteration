/**
 * Mutsawashe Maraidza
 * 24020134
 * BSc Computer Science and Software Engineering
 */

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        // Create Scanner to get input from the user
        Scanner input = new Scanner(System.in);

        // Variable to store the number
        int number;

        // Ask the user at least once
        do {

            // Ask the user to enter a number
            System.out.print("Enter a number between 1 and 10: ");
            number = input.nextInt();

        // Keep asking while the number is outside the range
        } while (number < 1 || number > 10);

        // Print the valid number
        System.out.println("Valid number: " + number);
    }
}