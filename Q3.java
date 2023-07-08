//program to check whether no is pelindrome or not
import java.util.*;

public class Q3 {
    
    public static void main(String [] args){
      int n,a,t;
      int rem=0;
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the no:");
       n=sc.nextInt();

       a=n;
      
       while(a!=0)
       {
        t=a%10;
        rem=rem*10 + t;
        a=a/10;
     }

if (n==rem){
    System.out.println("Pelindrome no");
}
else{
    System.out.println("No isn't pelindrome");
}
sc.close();
}

}
