//program to find the reverse of a string
import java.util.*;

public class Q39 {

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        String s;
        String rev="";

        System.out.print("enter string=");
        s=sc.nextLine();

        for(int i=s.length()-1;i>=0;i--){
           
            rev=rev+s.charAt(i);

        }

        System.out.print(rev);
        
        sc.close();
    }
}
