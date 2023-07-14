//program to print fibonacci series upto Nth term
import java.util.*;

public class Q30 {

    public static void main(String[]args){

    Scanner sc=new Scanner(System.in);

    int a=1,b=1;
    int c;

    System.out.print("enter no upto which u want to print fibonacci series=");
    int n=sc.nextInt();

    System.out.print(a+" "+b+" ");
    for(int i=3;i<=n;i++){
       
        c=a+b;
        System.out.print(c+" ");
        a=b;
        b=c;

    }

   
    }
}
