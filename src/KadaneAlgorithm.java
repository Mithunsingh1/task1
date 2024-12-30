
public class KadaneAlgorithm {

    // Function to find the maximum sum subarray
    public static int maxSubArraySum(int[] arr) {
        // Initialize the maximum sum and current sum
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        // Iterate over the array from the second element
        for (int i = 1; i < arr.length; i++) {
            // Update the current sum
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);

            // Update the maximum sum so far
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        // Return the maximum sum subarray
        return maxSoFar;
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        // Call the maxSubArraySum function and print the result
        System.out.println("Maximum Subarray Sum: " + maxSubArraySum(arr));
    }
}
