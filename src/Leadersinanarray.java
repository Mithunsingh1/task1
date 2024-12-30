
import java.util.*;

public class Leadersinanarray {
    public static void printLeaders(int[] arr) {
        int n = arr.length;
        
        // Start from the rightmost element
        int maxRight = arr[n - 1];
        System.out.print(maxRight + " "); // The rightmost element is always a leader
        
        // Traverse the array from the second last element
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                // If the current element is greater than the maximum on the right, it's a leader
                System.out.print(arr[i] + " ");
                maxRight = arr[i]; // Update the maximum on the right
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5};
        System.out.print("Leaders in the array: ");
        printLeaders(arr);
    }
}