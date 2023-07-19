//program to  check if it is automorphic or not. A number is called an Automorphic number if and only if its square ends 
//in the same digits as the number itself.
//ex= 76*76=5776

import java.util.*;

public class Q55 {
    
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter no=");
        n=sc.nextInt();

        int sq=n*n;
        int temp=n;
         boolean isAutomorphic=true;

        while(temp!=0){
          int dig=sq%10;
          int t=temp%10;
          
          if(dig!=t){
            isAutomorphic=false;
            break;
          }
          sq/=10;
          temp/=10;

        }
          
        if(isAutomorphic)
        {
            System.out.print("Automorphic number");
        }
        else {

            System.out.print("Non-Automorphic number");
        }

        sc.close();
    }
}
