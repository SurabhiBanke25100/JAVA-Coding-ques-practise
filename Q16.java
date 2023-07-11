//program to print sum of AP series
import java.util.*;

public class Q16 {
    
    public static void main(String[]args){
     
        int a,n,d;
        double ap;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a=");
          a=sc.nextInt();

        System.out.print("enter n=");
          n=sc.nextInt();

        System.out.print("enter d=");
         d=sc.nextInt();

        ap=(n/2.0)*(2.0*a+(n-1)*d);

        System.out.print("AP="+ap);







        sc.close();
    }
}
