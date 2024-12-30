import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "programming";
        
        // Create a map to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Convert the string to a char array
        for (char c : input.toCharArray()) {
            // If the character is already in the map, increment its count
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // Otherwise, add the character with a count of 1
                charCountMap.put(c, 1);
            }
        }
        
        // Print the frequency of each character
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}