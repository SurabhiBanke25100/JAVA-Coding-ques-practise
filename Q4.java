//program to find the reverse of a digit
import java.util.*;

public class Q4 {
    
    public static void main(String [] args){
      int n,a,t;
      int rem=0;
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the no=");
       n=sc.nextInt();
        a=n;
      
       while(a!=0)
       {
        t=a%10;
        rem=rem*10 + t;
        a=a/10;

     }
System.out.println("rev of no="+rem);

sc.close();
}
   
}
