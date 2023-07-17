//program to remove brackets from algebraic expression

import java.util.Scanner;

public class Q43 {
    
    public static void main(String[]args){

     Scanner sc=new Scanner(System.in);
    
     String s;
       String s1=""; 
     System.out.print("enter string=");
     s=sc.nextLine();

     for(int i=0;i<s.length();i++){

        char ch=s.charAt(i);

         if(!( ch=='[' || ch==']'|| ch=='(' || ch==')' ||ch=='{' ||ch=='}')){
            
            s1=s1+ch;
              
        }
      
     }
   
      System.out.println("output:" + s1);
      sc.close();

    }
}
