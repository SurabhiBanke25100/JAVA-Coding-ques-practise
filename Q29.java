//program to find maximum and minimum digit of no 
 import java.util.*;

public class Q29 {
 
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no=");
        int n=sc.nextInt();

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        while(n!=0){
          int dig=n%10;
          
          if(dig<min){
             min=dig;
          }

          if(dig>max){
            max=dig;
          }
          n=n/10;

        }
          
        System.out.print("max digit="+max+"  "+"min digit="+min);
    }
}
