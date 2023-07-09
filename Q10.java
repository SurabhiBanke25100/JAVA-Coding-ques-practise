//program to check no is perfect or not
import java.util.*;

public class Q10{
    
     public static void main(String[] args){
       int num1;
      int sum=0;
       Scanner sc =new Scanner(System.in);
       System.out.print("enter number=");
       num1=sc.nextInt();
       
      for(int i=1;i<num1;i++){
          if(num1%i==0){
              sum+=i;
          }
        }
        if(sum==num1){
            System.out.println("no is perfect");
        }
      else{
          System.out.println("no isn't perfect");
      }

sc.close();
    
}
}
