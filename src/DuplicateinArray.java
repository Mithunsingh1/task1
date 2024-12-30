import java.util.HashSet;

public class DuplicateinArray {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 2, 4 , 3 ,};

        // Create a HashSet to store unique elements
        HashSet<Integer> seen = new HashSet<>();

        System.out.println("Duplicate elements in the array:");

        // Iterate through the array to find duplicates
        for (int i = 0; i < array.length; i++) {
            // If the element is already in the set, it's a duplicate
            if (!seen.add(array[i])) {
                System.out.println(array[i]);
            }
        }
    }
}