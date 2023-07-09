//program to find greatest of 3 no
import java.util.*;

public class Q9 {
    
    
    public static void greatestthree(int a,int b,int c){
        
         if(a>b && a>c){
           System.out.println(a+" is greater");
       }
      
      else if(b>a && b>c){
          System.out.println(b+" is greater");
      }
      else{
          System.out.println(c+" is greater");
      }
    }
    
    public static void main(String[] args){
       int num1,num2,num3;
      
       Scanner sc =new Scanner(System.in);
       System.out.print("enter number1=");
       num1=sc.nextInt();
       
       System.out.print("enter number2=");
       num2=sc.nextInt();
       
       System.out.print("enter number3=");
       num3=sc.nextInt();
       
       greatestthree(num1,num2,num3);
      

sc.close();
    

    
}
}
