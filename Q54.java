//program to find  a no is strong or not 
//strong no = a no in which sum of factorial of each digit = original no

//ex- 145: 1!+4!+5!=145

import java.util.*;

public class Q54 {
    
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int n;
       
        n=sc.nextInt();
        int sum=0;
        int temp=n;

        
while(temp!=0)
{
         int digit=temp%10;
         int fact=1;

        for(int i=digit;i>0;i--){
            fact=fact*i;

            }
            sum+=fact; 
             temp/=10;
             
        }


if(sum==n){

    System.out.print("a strong no");
    }

    else{
        System.out.print("not a strong no");
    }

    sc.close();
    }
}
