//program to find the  sum of no in given range

import java.util.Scanner;

public class Q28 {
    
    public static void main(String[]args){
       
        Scanner sc = new Scanner(System.in);
       
        int sum=0;
        int min,max;

        //System.out.print("enter size=");
        //int dig=sc.nextInt();

         System.out.print("enter min range=");
         min=sc.nextInt();

         
         System.out.print("enter max range=");
         max=sc.nextInt();


        

         for(int i=min;i<=max;i++){
          
            sum+=i;          //remember here  value of min is store in "i"

         }
         System.out.println("sum="+sum);



    }
}
