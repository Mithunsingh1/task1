
public class countdigits{
    public static void main(String[] args) {
        int number = 45678;  // Example number
        int count = 0;
        
        // Handle the case where number is 0
        if (number == 0) {
            count = 1;
        } else {
            // Count the digits by dividing the number by 10 until it becomes 0
            while (number != 0) {
                number /= 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
    }
}