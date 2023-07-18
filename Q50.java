//program to change case of each character in  the string
import java.util.*;

public class Q50 {
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        String str1;
        String str2="";

        System.out.print("enter string=");
        str1=sc.nextLine();

        for(int i=0;i<str1.length();i++){

            char ch= str1.charAt(i);

            if(ch>='a' && ch<='z'){

                str2=str2+ Character.toUpperCase(ch);

            }

             if(ch>='A' && ch<='Z'){

                str2=str2+ Character.toLowerCase(ch);

            }
        }
        System.out.println(str2);
sc.close();
    }
}
