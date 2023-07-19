//program to print all the prime factors of the given number
import java.util.*;

public class Q53 {
    
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
     
    int n;
    System.out.print("enter num=");
    n=sc.nextInt();

    for(int i=2;i<=n;i++){

        while(n%i==0){
           System.out.print(i+" ");
           n/=i;
            
        }
    }
    
 

        sc.close();
    }
}
