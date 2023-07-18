//program to count no of words in given string
import java.util.*;


public class Q49 {

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        String str1;

        System.out.print("enter the string=");      //Taking input as string from the user
        str1=sc.nextLine();

         int space=1;

        for (int i=0;i<str1.length();i++){
           
           if(str1.charAt(i)==' '){       //counting no of words by counting spaces if present in betweeen the string like-heelo I am(2 spaces + 1=3 output)
                space+=1;
            }
        }
        System.out.print(space);

sc.close();
    }
}
