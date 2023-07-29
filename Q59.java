//program to 

import java.util.*;

public class Q59 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        while(n!=0){
            int digit=n%10;
            
            if(digit==0){
               digit=1;
            }
              n=n/10;
        }
          
       

    }
}
