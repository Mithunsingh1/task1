
public class pallindrome {
	
    public static void main(String[] args) {
        int number = 121;  // You can change this number to test other values
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        
        // Reverse the number
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            reversedNumber = reversedNumber * 10 + digit;  // Append the digit to the reversed number
            number /= 10;  // Remove the last digit
        }
        
        // Check if the original number is equal to the reversed number
        return originalNumber == reversedNumber;
    }
}