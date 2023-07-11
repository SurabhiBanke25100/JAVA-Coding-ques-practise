//program to factorial of no 

import java.util.*;

class Q17 {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    int fact=1;
    System.out.print("Enter n=");
    int n=sc.nextInt();
    
    for(int i=1;i<=n;i++){
        fact*=i;
        
        
    }
    
    System.out.print("factorial="+fact);
        
   
    sc.close();
   
    
    
    }
}
