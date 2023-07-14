//program to find duplicates elements in array

import java.util.*;

public class Q27 {
    
    public static void main(String[]args){
   
         Scanner sc = new Scanner(System.in);
        
        System.out.print("enter size=");
        int dig=sc.nextInt();

        int arr[]=new int[dig];

        for(int i=0; i<dig; i++){
            
           arr[i]=sc.nextInt();
            
        }

        for(int i=0;i<dig;i++){

            for(int j=i+1;j<dig;j++){
          
             if(arr[i]==arr[j]){
              System.out.print(arr[i]+" ");
              break;
             }
          }
        

        }

    }
}
