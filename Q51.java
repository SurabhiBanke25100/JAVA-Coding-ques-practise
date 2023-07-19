//program to check if  two strings are anagram to each other
import java.util.*;

public class Q51 {
    
    public static void main(String[]args){
        
        String str1,str2;
         
        Scanner sc=new Scanner(System.in);

         System.out.print("enter string1=");
         str1=sc.nextLine();

         System.out.print("enter string2=");
         str2=sc.nextLine();

         //for sorting using Arrays.sort(ch[]) method: Here, character array is passed as an parameter thus using "toCharArray()" method to convert string into char array.  

         char[] ch1=str1.toCharArray();
         char[] ch2=str2.toCharArray();
        
      //1. checking length of the two string

         if(ch1.length!=ch2.length){
            System.out.print("false");
            System.exit(0);
           }

         Arrays.sort(ch1);
         Arrays.sort(ch2);


        for(int i=0;i<str1.length();i++){
          
            if(ch1[i]!=ch2[i]){
                System.out.print("true");
                System.exit(0);

            }
        }

      System.out.println("true");

      sc.close();

    }
}
