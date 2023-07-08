//program to check no is armstrong or nt
import java.util.*;

public class Q7 {
    
public static void main(String[]args){
    int n,a;
    int rem=0;

   // System.out.println("enter the no=");
     Scanner sc=new Scanner(System.in);
     
System.out.println("enter the no=");
    n=sc.nextInt();
     a=n;


    while(a!=0){
        int dig=a%10;
        rem+=dig*dig*dig;
        a=a/10;
    }

    if(n==rem){
        System.out.print("armstrng no");

    }
    else{
        System.out.print("no isnt amrstrng");
    }

sc.close();
    }
}
