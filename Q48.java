//program to find freq of character in given string

import java.util.*;

public class Q48 {
    
    public static void main(String[]args){

    Scanner sc=new Scanner(System.in);
    String str1;
   
    System.out.print("enter str1=");
    str1=sc.nextLine();

    for(int i=0;i<str1.length();i++){

        int count=1;
        boolean visited[]=new boolean[str1.length()];

       visited[i]=true;
      
       for(int j=i+1;j<str1.length();j++){

        if(!visited[j] && str1.charAt(i)==str1.charAt(j)){
            count++;
            visited[j]=true;
          
        }
       } 
           if(!visited[i])  System.out.println(str1.charAt(i)+" "+count);

          }
          
    sc.close();
        

    }
}
