//program to remove characters except alphabets

import java.util.Scanner;

public class Q42 {
    
    public static void main(String[]args){

     Scanner sc=new Scanner(System.in);
    
     String s;
       String s1=""; 
     System.out.print("enter string=");
     s=sc.nextLine();

     for(int i=0;i<s.length();i++){

        char ch=s.charAt(i);

            if((ch>=97 && ch<=122) || (ch>=65 && ch<=90)){     //ascii value: a-z=97-122, A-Z= 65-90, 0-9= 48-57
            
            s1=s1+ch;
              
        }
      
     }
     //System.out.println();
      System.out.println("output:" + s1);

        
     sc.close();

    }
}
