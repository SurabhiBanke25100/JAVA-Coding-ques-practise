
//program to print pelindrome nos in given range
import java.util.*;

public class Q5 {
    
    public static void main(String [] args){
      int t,min,max;
      
      Scanner sc=new Scanner(System.in);
      
      System.out.print("enter the min:");
      min=sc.nextInt();

      System.out.print("enter the max:");
      max=sc.nextInt();
        
    
 for(int i=min;i<=max;i++){
    int a=i;
    int rem=0;
       while(a!=0)
       {
        t=a%10;
        rem=rem*10 + t;
        a=a/10;

    }
    if(i==rem){
        System.out.print(i+" ");
    }
}


sc.close();

}
   
}
