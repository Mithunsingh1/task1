public class TrapRainwater {

    public static int trap(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }

        int n = heights.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int waterTrapped = 0;

        // Calculate leftMax array (maximum height from left to right)
        leftMax[0] = heights[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
        }

        // Calculate rightMax array (maximum height from right to left)
        rightMax[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], heights[i]);
        }

        // Calculate the trapped water at each position
        for (int i = 0; i < n; i++) {
            // The water trapped at index i is the minimum of the maximum heights 
            // on both sides minus the height at index i
            waterTrapped += Math.min(leftMax[i], rightMax[i]) - heights[i];
        }

        return waterTrapped;
    }

    public static void main(String[] args) {
        int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}; // Example input
        System.out.println("Amount of trapped rainwater: " + trap(heights));
    }
}