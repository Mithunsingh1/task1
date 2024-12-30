
import java.util.Scanner;

public class StringPermutations {

    // Function to generate all permutations of the string
    public static void generatePermutations(String str) {
        // Convert string to character array
        char[] charArray = str.toCharArray();
        // Call the helper function with the character array and starting index
        generatePermutationsHelper(charArray, 0);
    }

    // Helper function to generate permutations
    private static void generatePermutationsHelper(char[] charArray, int currentIndex) {
        // Base case: if current index is the last character, print the permutation
        if (currentIndex == charArray.length) {
            System.out.println(new String(charArray));
            return;
        }

        // Swap each character with the current index and recurse
        for (int i = currentIndex; i < charArray.length; i++) {
            // Swap the characters
            swap(charArray, currentIndex, i);
            // Recurse for the next index
            generatePermutationsHelper(charArray, currentIndex + 1);
            // Backtrack by swapping back
            swap(charArray, currentIndex, i);
        }
    }

    // Function to swap two characters in the array
    private static void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Sample input string
        String str = "ABC";
        System.out.println("All permutations of the string:");
        generatePermutations(str);
    }
}
