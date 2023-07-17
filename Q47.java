//program to find non-repeating characters from given string

import java.util.*;

public class Q47 {
    
    public static void main(String[]args){

    Scanner sc=new Scanner(System.in);
    String str1;
   
    System.out.print("enter str1=");
    str1=sc.nextLine();
   
    for(int i=0;i<str1.length();i++){

       boolean isduplicate=false;

       for(int j=0;j<str1.length();j++){

        if(i!=j && str1.charAt(i)==str1.charAt(j)){
           
            isduplicate=true;
            break;
        }

       } 

          if(!isduplicate){
          System.out.println(str1.charAt(i));

          }
          
    }

    sc.close();

    }
}
