//find lcm of no

import java.util.Scanner;

public class Q12 {
    
    public static void main(String[]args){
        int a,b;
        int gcd=1;

        Scanner sc =new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();

        for(int i=1;i<=Math.min(a,b);i++){
            if(a%2==0 && b%2==0){
                gcd=i;
            }
       }
      
       int lcm=(a*b)/gcd;
       System.out.print(lcm);

     


       sc.close();
    }
}
