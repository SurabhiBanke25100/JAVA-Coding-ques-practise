//program to remove all vowels from string

import java.util.Scanner;

public class Q40 {
    
    public static void main(String[]args){

     Scanner sc=new Scanner(System.in);
    
     String s;
       String s1=""; 
     System.out.print("enter string=");
     s=sc.nextLine();

     for(int i=0;i<s.length();i++){

        char ch=s.charAt(i);

            if(!(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
            
            s1=s1+ch;
              
        }
      
     }

      System.out.println("output:" + s1);

        
     sc.close();

    }
}
