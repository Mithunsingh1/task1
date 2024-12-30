import java.util.Scanner;

public class SudokuSolver {

    // Function to check if a number can be placed at grid[row][col]
    public static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check if the number is already present in the row
        for (int x = 0; x < 9; x++) {
            if (board[row][x] == num) {
                return false;
            }
        }

        // Check if the number is already present in the column
        for (int x = 0; x < 9; x++) {
            if (board[x][col] == num) {
                return false;
            }
        }

        // Check if the number is present in the 3x3 subgrid
        int startRow = row - row % 3, startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    // Function to solve the Sudoku using backtracking
    public static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                // If the cell is empty (value is 0)
                if (board[row][col] == 0) {
                    // Try placing numbers 1-9
                    for (int num = 1; num <= 9; num++) {
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num;

                            // Recursively try to solve the rest of the board
                            if (solveSudoku(board)) {
                                return true;
                            }

                            // Backtrack if placing num didn't work
                            board[row][col] = 0;
                        }
                    }
                    return false; // If no number fits, return false
                }
            }
        }
        return true; // Solved successfully
    }

    // Function to validate the Sudoku board
    public static boolean isValidSudoku(int[][] board) {
        // Check each row and column for duplicates
        for (int i = 0; i < 9; i++) {
            boolean[] rowCheck = new boolean[9];
            boolean[] colCheck = new boolean[9];
            for (int j = 0; j < 9; j++) {
                // Check row
                if (board[i][j] != 0) {
                    if (rowCheck[board[i][j] - 1]) return false;
                    rowCheck[board[i][j] - 1] = true;
                }

                // Check column
                if (board[j][i] != 0) {
                    if (colCheck[board[j][i] - 1]) return false;
                    colCheck[board[j][i] - 1] = true;
                }
            }
        }

        // Check each 3x3 subgrid
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                boolean[] subgridCheck = new boolean[9];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int num = board[row + i][col + j];
                        if (num != 0) {
                            if (subgridCheck[num - 1]) return false;
                            subgridCheck[num - 1] = true;
                        }
                    }
                }
            }
        }
        return true; // If no duplicates found
    }

    // Function to print the Sudoku board
    public static void printBoard(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] board = new int[9][9];

        // Take input for the Sudoku board from the user
        System.out.println("Enter the Sudoku puzzle (use 0 for empty cells):");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        // Validate the Sudoku
        if (isValidSudoku(board)) {
            System.out.println("The Sudoku board is valid.");
            // Solve the Sudoku if valid
            if (solveSudoku(board)) {
                System.out.println("Solved Sudoku:");
                printBoard(board);
            } else {
                System.out.println("No solution exists.");
            }
        } else {
            System.out.println("The Sudoku board is not valid.");
        }

        scanner.close();
    }
}