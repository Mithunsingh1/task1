
import java.util.Scanner;

public class Fibonaccisequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms to generate
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Close the scanner after use
        scanner.close();

        // First two terms of the Fibonacci sequence
        int a = 0, b = 1;

        System.out.println("Fibonacci sequence up to " + n + " terms:");

        // Print the Fibonacci sequence up to n terms
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }
}