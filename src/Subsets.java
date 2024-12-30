import java.util.*;

public class Subsets {

    // Function to generate all subsets using bit manipulation
    public static List<List<Integer>> generateSubsets(List<Integer> set) {
        List<List<Integer>> allSubsets = new ArrayList<>();
        int subsetCount = 1 << set.size(); // Total subsets = 2^n

        // Loop over all bitmasks
        for (int mask = 0; mask < subsetCount; mask++) {
            List<Integer> currentSubset = new ArrayList<>();
            for (int i = 0; i < set.size(); i++) {
                // If the ith bit of mask is set, include set[i] in the subset
                if ((mask & (1 << i)) != 0) {
                    currentSubset.add(set.get(i));
                }
            }
            allSubsets.add(currentSubset);
        }
        
        return allSubsets;
    }

    public static void main(String[] args) {
        List<Integer> set = Arrays.asList(1, 2, 3);
        List<List<Integer>> allSubsets = generateSubsets(set);
        
        // Print the subsets
        for (List<Integer> subset : allSubsets) {
            System.out.println(subset);
        }
    }
}
