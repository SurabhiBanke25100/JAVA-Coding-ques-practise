//program to find gcd of no

import java.util.*;

public class Q13 {

    public static void main(String[]args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no1=");
        a=sc.nextInt();

        System.out.print("enter the no2=");
        b=sc.nextInt();
       
       
        //applied euclidean concept->  (a%b,b)->if a>b then (a=a%b) otherwise (b%a if b>a) 
        //added to this if anyone of them would be zero then other will be the gcd



        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }

             }

        if(a==0){
            System.out.print("gcd="+b);
        }
        else{
            System.out.print("gcd="+a);
        }


        sc.close();
    }
}


    

    

