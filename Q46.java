//program to remove duplicates from given string

import java.util.*;

public class Q46 {
    
    public static void main(String[]args){

    Scanner sc=new Scanner(System.in);
    String str1;
   
    System.out.print("enter str1=");
    str1=sc.nextLine();
   
    for(int i=0;i<str1.length();i++){

       // int count=1;
      boolean isduplicate=false;

       for(int j=i+1;j<str1.length();j++){

        if(str1.charAt(i)==str1.charAt(j)){
           // count++;
            isduplicate=true;
        }
       } 

          if(!isduplicate){
        System.out.println(str1.charAt(i));
          }
          
    }

    sc.close();

    }
}
