
import java.util.Scanner;

public class armstrongnumber {
    
    public static boolean isArmstrong(int num) {
        int sum = 0;
        int originalNum = num;
        int numberOfDigits = Integer.toString(num).length();  // Get number of digits

        // Calculate sum of each digit raised to the power of the number of digits
        while (num > 0) {
            int digit = num % 10;  // Get last digit
            sum += Math.pow(digit, numberOfDigits);  // Add digit raised to the power
            num /= 10;  // Remove last digit
        }

        // Check if sum equals the original number
        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        
        scanner.close();
    }
}