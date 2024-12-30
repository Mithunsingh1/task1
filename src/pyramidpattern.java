
import java.util.Scanner;

public class pyramidpattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the number of rows in the pyramid
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        // Printing the pyramid pattern
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for the current row
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            
            // Print stars for the current row
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            // Move to the next line after each row
            System.out.println();
        }
        
        scanner.close();
    }
}