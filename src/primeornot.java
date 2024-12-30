
import java.util.Scanner;

public class primeornot {

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        // Handle edge cases
        if (number <= 1) {
            return false;
        }
        
        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Not prime if divisible by any number other than 1 and itself
            }
        }
        return true; // Number is prime
    }

    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Check if the number is prime and display the result
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        scanner.close(); // Close scanner
    }
}