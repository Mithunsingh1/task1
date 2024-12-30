import java.util.Scanner;
import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSmallestLargest {

    // Method to find the Kth smallest element using sorting
    public static int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr); // Sort the array in ascending order
        return arr[k - 1]; // Kth smallest element (0-based index)
    }

    // Method to find the Kth largest element using sorting
    public static int kthLargest(int[] arr, int k) {
        Arrays.sort(arr); // Sort the array in ascending order
        return arr[arr.length - k]; // Kth largest element (0-based index)
    }

    // Method to find the Kth smallest element using Min-Heap
    public static int kthSmallestUsingHeap(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int num : arr) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll(); // Remove the largest element if the size exceeds k
            }
        }
        return maxHeap.peek(); // The root of the heap will be the Kth smallest element
    }

    // Method to find the Kth largest element using Min-Heap
    public static int kthLargestUsingHeap(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if the size exceeds k
            }
        }
        return minHeap.peek(); // The root of the heap will be the Kth largest element
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Take input for the value of K
        System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();

        // Find the Kth smallest and Kth largest element using sorting
        int kthSmallest = kthSmallest(arr, k);
        int kthLargest = kthLargest(arr, k);

        // Find the Kth smallest and Kth largest element using heaps
        int kthSmallestHeap = kthSmallestUsingHeap(arr, k);
        int kthLargestHeap = kthLargestUsingHeap(arr, k);

        // Print the results
        System.out.println("Using Sorting:");
        System.out.println("Kth smallest element: " + kthSmallest);
        System.out.println("Kth largest element: " + kthLargest);

        System.out.println("Using Heap:");
        System.out.println("Kth smallest element: " + kthSmallestHeap);
        System.out.println("Kth largest element: " + kthLargestHeap);

        scanner.close();
    }
}