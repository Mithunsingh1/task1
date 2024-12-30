
import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Initialize a variable to store the sum of digits
        int sum = 0;
        
        // Use a while loop to extract and sum the digits of the number
        while (number != 0) {
            // Extract the last digit
            int digit = number % 10;
            
            // Add the digit to the sum
            sum += digit;
            
            // Remove the last digit from the number
            number /= 10;
        }
        
        // Output the sum of the digits
        System.out.println("The sum of the digits is: " + sum);
        
        // Close the scanner
        scanner.close();
    }
}
