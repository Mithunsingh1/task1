import java.util.Scanner;

public class LCMoftwonumber {
    // Function to calculate the GCD (Greatest Common Divisor)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Function to calculate the LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        // Create scanner object to take input
        Scanner sc = new Scanner(System.in);
        
        // Taking input for two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        // Calculating the LCM
        int result = lcm(num1, num2);
        
        // Output the result
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + result);
        
        // Close the scanner object
        sc.close();
    }
}