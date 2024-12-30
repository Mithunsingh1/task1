import java.util.Scanner;

public class LCMandGCD {

    // Method to compute GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to compute LCM using the formula LCM(a, b) = (a * b) / GCD(a, b)
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Compute GCD and LCM
        int gcdResult = gcd(num1, num2);
        int lcmResult = lcm(num1, num2);

        // Output the results
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdResult);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmResult);

        scanner.close();
    }
}