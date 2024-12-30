import java.util.Scanner;

public class ZigZagPattern {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Number of rows
        int rows = (int) Math.ceil(Math.sqrt(n));

        // Initialize a 2D array to hold the zig-zag numbers
        int[][] zigzag = new int[rows][rows];

        // Filling the zig-zag array
        int currentNum = 1;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // Fill left to right for even indexed rows
                for (int j = 0; j < rows && currentNum <= n; j++) {
                    zigzag[i][j] = currentNum++;
                }
            } else {
                // Fill right to left for odd indexed rows
                for (int j = rows - 1; j >= 0 && currentNum <= n; j--) {
                    zigzag[i][j] = currentNum++;
                }
            }
        }

        // Printing the zig-zag pattern
        System.out.println("Zig-zag pattern:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (zigzag[i][j] != 0) {  // Only print non-zero values
                    System.out.print(zigzag[i][j] + " ");
                }
            }
            System.out.println();
        }
        
        // Close the scanner
        scanner.close();
    }
}