import java.util.Scanner;

public class NQueens {

    // This method solves the N-Queens problem using backtracking.
    public static boolean solveNQueens(int n) {
        int[] board = new int[n]; // board[i] will store the column position of the queen in row i

        // Try to place queens row by row
        if (solveNQueensUtil(board, 0, n)) {
            printSolution(board, n);
            return true;
        } else {
            System.out.println("Solution does not exist.");
            return false;
        }
    }

    // A recursive utility function to solve N-Queens problem
    public static boolean solveNQueensUtil(int[] board, int row, int n) {
        // If all queens are placed, return true
        if (row == n) {
            return true;
        }

        // Try placing this queen in all columns one by one
        for (int col = 0; col < n; col++) {
            // Check if it's safe to place the queen at board[row][col]
            if (isSafe(board, row, col, n)) {
                // Place this queen in the current position
                board[row] = col;

                // Recur to place the next queen
                if (solveNQueensUtil(board, row + 1, n)) {
                    return true;
                }

                // If placing queen in current position leads to a solution, return true
                // If not, backtrack by removing the queen
                board[row] = -1;
            }
        }

        // If the queen cannot be placed in any column in this row, return false
        return false;
    }

    // A utility function to check if it's safe to place a queen at board[row][col]
    public static boolean isSafe(int[] board, int row, int col, int n) {
        // Check this column on previous rows
        for (int i = 0; i < row; i++) {
            // Check if two queens are in the same column or same diagonal
            if (board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    // A utility function to print the chessboard with queens' positions
    public static void printSolution(int[] board, int n) {
        System.out.println("Solution:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i] == j) {
                    System.out.print("Q ");  // Queen is placed
                } else {
                    System.out.print(". ");  // Empty space
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N (size of the chessboard): ");
        int n = sc.nextInt(); // Take user input for the size of the chessboard

        if (!solveNQueens(n)) {
            System.out.println("Solution does not exist.");
        }
        sc.close();
    }
}