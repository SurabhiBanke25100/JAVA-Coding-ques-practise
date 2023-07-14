//program to calculate the  sum and average of the elements of the array 
import java.util.*;


public class Q26 {

    public static void main(String[]args){

         Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.print("enter size=");
        int dig=sc.nextInt();

        int arr[]=new int[dig];

        for(int i=0; i<dig; i++){
            
           arr[i]=sc.nextInt();
            
        }

         for(int i=0;i<dig;i++){
          
            sum+=arr[i];

         }
         System.out.println("sum="+sum);

         int avg=sum/dig;

         System.out.println("avg="+avg);

         sc.close();
    }

}
