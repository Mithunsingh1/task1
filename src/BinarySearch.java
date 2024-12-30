
import java.util.Scanner;

public class BinarySearch {

    // Binary search function
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at mid
            if (arr[mid] == target) {
                return mid; // Target found, return index
            }

            // If the target is smaller, ignore the right half
            if (arr[mid] > target) {
                right = mid - 1;
            }
            // If the target is larger, ignore the left half
            else {
                left = mid + 1;
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample sorted array
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        // Get the target value from the user
        System.out.print("Enter the value to search for: ");
        int target = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(arr, target);

        // Print the result
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }
}