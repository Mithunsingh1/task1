
import java.util.Scanner;

public class perfectnumber {
    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        
        // Loop to find the sum of divisors of the number
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        // Check if the sum of divisors is equal to the number itself
        return sum == num;
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a perfect number
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        scanner.close();
    }
}