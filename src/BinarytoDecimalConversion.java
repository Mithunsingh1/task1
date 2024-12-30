
import java.util.Scanner;

public class BinarytoDecimalConversion{
         public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a binary number
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        // Convert the binary string to a decimal number
        int decimal = Integer.parseInt(binaryString, 2);

        // Print the result
        System.out.println("The decimal equivalent is: " + decimal);
        
        // Close the scanner
        scanner.close();
    }
}