//program to count no of vowels,consonants,whtespaces in goven string

import java.util.*;

class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int v = 0, c = 0, w = 0;
        
        System.out.print("Enter string: ");
        str = sc.nextLine();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));        //convert string into lowercase
            
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    v++;
                } else {
                    c++;
                }
            } else if (ch == ' ') {
                w++;
            }
        }
        
        System.out.println("v = " + v);
        System.out.println("c = " + c);
        System.out.println("w = " + w);
        
        sc.close();
    }
}
