//program to find  the median of the array 
import java.util.*;


public class Q34 {

    public static void main(String[]args){
      
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size=");
        int  dig= sc.nextInt();
        int  arr[]=new int[dig];

        System.out.print("enter the array elements=");
         
        for(int i=0;i<dig;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);          //Arrays.sort():  method to  sort the array  in asc order (import java.util.)

            int t1=(dig/2)-1;
            int t2=dig/2;
            int t3=(dig+1)/2;

        if(dig%2==0){
        
            double n=(double)(arr[t1]+ arr[t2])/2;
            System.out.print(n);
        }
      
       else{
              double n=arr[t3];
              System.out.print(n);
        }

     sc.close();
    }
}
