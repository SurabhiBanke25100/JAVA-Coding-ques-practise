//program to find maximum occuring character in input string

import java.util.*;

public class Q52 {

    public static void main(String[]args){

       Scanner sc=new Scanner(System.in) ;
       String str1;

       System.out.print("enter the string=");
       str1=sc.nextLine();
        
       char[] count=new char[256];     //to count the char occured 

       for(int i=0;i<str1.length();i++){
        
        count[str1.charAt(i)]++;
          
        }
       
        int maxCount = 0;
        char maxChar = '\0';    //here maxchar='\0' this means there is no prior value inside the maxchar

        // Find the character with maximum occurrence
        
        for (int i = 0; i < 256; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxChar = (char)i;
            }
        }

        System.out.println("Maximum occurring character: " + maxChar);
    
        sc.close();
    }
    
}
