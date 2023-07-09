//program to find pelindrome of no
import java.util.*;

public class Q8 {
    
    
    public static void IsEvenOdd(int num){
        
         if(num%2==0){
           System.out.println("no is even");
       }
      
      else{
          System.out.println("no is odd");
      }
    }
    
    public static void main(String[] args){
       int num;
      

       Scanner sc =new Scanner(System.in);
       System.out.print("enter number=");
       num=sc.nextInt();
       
       IsEvenOdd(num);

      


sc.close();
    

    
}
}
