/**
 * Mutsawashe Maraidza
 * 24020134
 * BSc Computer Science and Software Engineering
 */
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        // Create Scanner to get input from the user
        Scanner input = new Scanner(System.in);

        // Variable to store the user's choice
        int choice;

        // Display the menu at least once
        do {

            // Display the menu
            System.out.println("1. Continue");
            System.out.println("2. Exit");

            // Ask the user to enter a choice
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

        // Keep repeating while the choice is not 2
        } while (choice != 2);
    }
}