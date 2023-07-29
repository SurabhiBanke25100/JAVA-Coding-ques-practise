//program to find number is abundant no or not
//if the sum of digit of divisor is greater than no itself then that no is abundant no
// ex- 21 ->divisors:1,3,7 (sum=1+3+7=11)11 is less than 21 , hence 21 is non abundant no.

import java.util.*;

public class Q57 {
    
    public static void main(String[]args){
       
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter no=");
        n=sc.nextInt();

        int temp=n;
        int sum=0;

        for(int i=1;i<temp;i++){ 
            if(n%i==0){
                 System.out.print(i+" ");
                 sum+=i;
            }
            
        }
         
         System.out.println("sum="+sum+" ");
        
         if(sum>n){
            System.out.println(n+" is Abundant No");
        }
        
        else
        {
            System.out.println(n+" is Non-Abundant No");
        }

     sc.close();
    }
}
