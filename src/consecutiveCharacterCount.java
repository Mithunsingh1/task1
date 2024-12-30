import java.util.Scanner;

public class consecutiveCharacterCount {
    
    public static String compressString(String str) {
        // Handle empty string case
        if (str == null || str.length() == 0) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;  // Start with a count of 1 for the first character

        // Loop through the string, starting from the second character
        for (int i = 1; i < str.length(); i++) {
            // If the current character is the same as the previous one, increment count
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                // Otherwise, append the previous character and its count to the result
                compressed.append(str.charAt(i - 1));
                if (count > 1) {
                    compressed.append(count);
                }
                // Reset the count for the new character
                count = 1;
            }
        }

        // Append the last character and its count
        compressed.append(str.charAt(str.length() - 1));
        if (count > 1) {
            compressed.append(count);
        }

        // Return the compressed string
        return compressed.toString();
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string to compress: ");
        String input = scanner.nextLine();  // Read user input

        // Call the compressString function
        String compressed = compressString(input);

        // Output the result
        System.out.println("Compressed String: " + compressed);

        // Close the scanner
        scanner.close();
    }
}