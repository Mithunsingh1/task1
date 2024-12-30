
import java.util.HashSet;

public class longestsubstringwithoutrepeatingcharacters {
    public static int longestSubstringWithoutRepeatingCharacters(String s) {
        // Use a HashSet to store characters of the current window
        HashSet<Character> set = new HashSet<>();
        int left = 0; // Left boundary of the window
        int maxLength = 0; // To keep track of the maximum length
        
        // Traverse the string with the right pointer
        for (int right = 0; right < s.length(); right++) {
            // If character is already in the set, remove characters from the left until the character is removed
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            
            // Add the current character to the set
            set.add(s.charAt(right));
            
            // Update the maximum length of the substring
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Longest substring length without repeating characters: " + longestSubstringWithoutRepeatingCharacters(input));
    }
}