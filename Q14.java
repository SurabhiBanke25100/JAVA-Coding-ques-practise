//to check string is pelindrome or not 
import java.util.*;

public class Q14 {

    public static void main(String[] args){

        String str;
        String rev="";
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string=");
        str=sc.nextLine();
        int start=0;
        int end=str.length()-1 ;

        for(int i=end;i>=start;i--){
            rev=rev+str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println(str + "  is pelindrome");
        }
        else{
             System.out.println(str + "  isn't pelindrome");
        }
        
      sc.close();

    }
}
