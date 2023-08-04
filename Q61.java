import java.util.*;

public class Q61 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1, s2;

        System.out.print("Enter the first string: ");
        s1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        s2 = sc.nextLine();

        String result = removeCharacters(s1, s2);
        System.out.println("Resultant String: " + result);

        sc.close();
    }

    public static String removeCharacters(String s1, String s2) {
        StringBuilder result = new StringBuilder();

        for (char ch : s1.toCharArray()) {
            if (s2.indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
