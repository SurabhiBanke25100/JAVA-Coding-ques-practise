// Online Java Compiler
// Use this editor to write, compile and run your Java code online

//program to count frequency of each element in given array
import java.util.*;

public class Q31 {

public static void main(String[]args){
      
     Scanner sc = new Scanner(System.in);

     //int count=1;
        
     System.out.print("enter size=");
    
     int dig=sc.nextInt();

    boolean visit[] =new boolean[dig];

    int arr[]=new int[dig];

     for(int i=0; i<dig; i++){
            
        arr[i]=sc.nextInt();
            
        }
      
        for(int i=0; i<dig; i++){
     
            int count=1;

            if(visit[i]==true){
              continue;
            }

            for(int j=i+1;j<dig;j++){

             if(arr[i]==arr[j]){
                 visit[j]=true;
                count++;

                
            }
            
        }

         System.out.println(arr[i]+"  count="+count);
        }
           
        sc.close();

    }
}
