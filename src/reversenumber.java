
public class reversenumber {
    public static void main(String[] args) {
        int num = 1234; // Example number
        int reversedNumber = reverseDigits(num);
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverseDigits(int num) {
        int reversed = 0;
        
        while (num != 0) {
            int digit = num % 10;  // Get the last digit
            reversed = reversed * 10 + digit;  // Append it to the reversed number
            num /= 10;  // Remove the last digit from num
        }
        
        return reversed;
    }
}