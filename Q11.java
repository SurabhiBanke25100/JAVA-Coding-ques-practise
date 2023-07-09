//program to find factor of a no

import java.util.*;

public class Q11 {
    
    public static void main(String[] args){
        
        Scanner sc =new Scanner(System.in);
        int num;
        System.out.print("enter no=");
        num=sc.nextInt();

        for(int i=1;i<=num;i++){
            if (num%i==0){
                System.out.print(i+" ");
            }
         }
             

        sc.close();

    }
}
