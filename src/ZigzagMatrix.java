
import java.util.Scanner;

public class ZigzagMatrix {
    
    public static void fillZigzagMatrix(int n) {
        int[][] matrix = new int[n][n];  // Create an n x n matrix
        int num = 1;  // Start filling the matrix with number 1
        for (int i = 0; i < n; i++) {
            // If the current row is even, fill it from left to right
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = num++;
                }
            } 
            // If the current row is odd, fill it from right to left
            else {
                for (int j = n - 1; j >= 0; j--) {
                    matrix[i][j] = num++;
                }
            }
        }
        
        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();  // Read the size of the matrix
        
        fillZigzagMatrix(n);  // Call the method to fill and print the matrix
    }
}