import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the factorial result
        long factorial = 1;

        // Calculate the factorial using a loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Print the result
        System.out.println("Factorial of " + number + " is: " + factorial);

        // Close the scanner object
        scanner.close();
    }
}