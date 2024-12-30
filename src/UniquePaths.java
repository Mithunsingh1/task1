import java.util.Scanner;

public class UniquePaths {
    // Method to calculate unique paths using dynamic programming
    public int uniquePaths(int m, int n) {
        // Create a 2D array to store the number of paths for each cell
        int[][] dp = new int[m][n];

        // Fill the first row and first column with 1
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;  // Only one way to go down in the first column
        }

        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;  // Only one way to go right in the first row
        }

        // Fill the rest of the dp table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];  // Number of ways to reach (i, j)
            }
        }

        // The value at the bottom-right corner is the number of unique paths
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for m and n
        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();

        // Create an instance of UniquePaths
        UniquePaths solution = new UniquePaths();
        
        // Calculate the unique paths
        int result = solution.uniquePaths(m, n);

        // Output the result
        System.out.println("Number of unique paths from top-left to bottom-right: " + result);

        // Close the scanner
        scanner.close();
    }
}