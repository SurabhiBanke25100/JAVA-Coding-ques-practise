//program to find pelindrome of no
import java.util.*;

public class Q3 {
    
    public static void main(String[] args){
       int num,a;
       int rem=0;

       Scanner sc =new Scanner(System.in);
       System.out.print("enter number=");
       num=sc.nextInt();
       
       a=num;

       while(a!=0){
           int digit=a%10;
           rem=rem*10+digit;
           a=a/10;
       }

       if(num==rem){
        System.out.print("pelindrome no");
       }

       else{
        System.out.print("Non-pelindrome no");
       }


sc.close();
    

    }

}
