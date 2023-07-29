import java.util.*;

public class Q60 {
      
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int sum = 0;
        StringBuilder numStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                // Append the digit to the temporary number string
                numStr.append(ch);
            } else {
                // If a non-digit character is encountered, add the temporary number to the sum
                if (numStr.length() > 0) {
                    sum += Integer.parseInt(numStr.toString());
                    numStr.setLength(0); // Clear the temporary number string
                }
            }
        }

        // Add the last temporary number (if any) to the sum
        if (numStr.length() > 0) {
            sum += Integer.parseInt(numStr.toString());
        }

        System.out.println("Sum of numbers in the string: " + sum);
        
    }
}
