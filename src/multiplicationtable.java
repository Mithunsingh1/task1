
import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        // Print the multiplication table
        System.out.println("Multiplication table for " + number + ":");

        // Loop to generate the table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // Close the scanner
        scanner.close();
    }
}