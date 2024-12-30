
public class MatrixTranspose {
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1, 2},
            {3, 4},
        };

        // Compute transpose
        int[][] transpose = transposeMatrix(matrix);

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        printMatrix(transpose);
    }

    // Method to compute the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows]; // Transposed matrix dimensions are swapped

        // Fill in the transposed matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}