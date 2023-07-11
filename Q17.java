//program to find gp of series
import java.util.*;

class Q17 {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n=");
    int n=sc.nextInt();
    
    System.out.print("Enter a=");
    int a=sc.nextInt();
    
    System.out.print("Enter r=");
    int r=sc.nextInt();
    
    double gp=(a*(Math.pow(r,n)-1))/(r-1);
    
    System.out.print("sum of GP series="+gp);
        
   
   sc.close(); 
    }
}