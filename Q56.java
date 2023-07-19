//program to find numbr is harshad or not
//harshad no= If the sum of digits is divisible by the number itself then it is called Harshad number.
//ex-378: 3+7+8 =18 and 378 is div by 18(sum of digit)
import java.util.*;

public class Q56 {
    
    public static void main(String[]args){
       
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter no=");
        n=sc.nextInt();

        int temp=n;
        int sum=0;

        while(temp!=0){
            int t=temp%10;
             sum+=t;
            temp=temp/10;
        }
        //System.out.print("sum="+sum);
        
        if(temp%sum==0){
            System.out.print("no is Harshad");
        }
        else
        {
            System.out.print("no isn't Harshad");
        }


     sc.close();
    }
}
