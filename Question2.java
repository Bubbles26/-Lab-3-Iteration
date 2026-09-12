/**
 * Mutsawashe Maraidza
 * 24020134
 * BSc Computer Science and Software Engineering
 */

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        // Create Scanner to get input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a positive whole number
        System.out.print("Enter a positive whole number: ");
        int number = input.nextInt();

        // Start counting from 1
        int count = 1;

        // Start the sum at 0
        int sum = 0;

        // Keep looping while count is less than or equal to number
        while (count <= number) {

            // Add count to the sum
            sum = sum + count;

            // Move to the next number
            count++;
        }

        // Print the final sum
        System.out.println("Sum: " + sum);
    }
}