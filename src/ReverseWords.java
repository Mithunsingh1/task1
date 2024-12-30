
public class ReverseWords {
    public static void main(String[] args) {
        String input = "Hello World ";
        String reversed = reverseWords(input);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseWords(String str) {
        // Split the string into words
        String[] words = str.split(" ");
        
        // StringBuilder to hold the result
        StringBuilder reversedString = new StringBuilder();
        
        // Loop through the words array from the end to the beginning
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i != 0) {
                reversedString.append(" "); // Add space between words
            }
        }
        
        return reversedString.toString();
    }
}