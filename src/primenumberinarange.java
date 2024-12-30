
public class primenumberinarange{
    public static void main(String[] args) {
        int start = 10; // Starting number
        int end = 20;   // Ending number
        
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        
        // Iterate through each number in the range
        for (int num = start; num <= end; num++) {
            // Check if the current number is prime
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // num is divisible by i, so it's not prime
            }
        }
        return true; // num is prime
    }
}