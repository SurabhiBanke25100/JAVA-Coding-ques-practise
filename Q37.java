//program to remove duplicates from an unsorted array

import java.util.*;

public class Q37 {
    
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

         
        System.out.print("enter size=");
        int  dig= sc.nextInt();
        int  arr[]=new int[dig];

        System.out.print("enter the array elements=");
         
        for(int i=0;i<dig;i++){
            arr[i]=sc.nextInt();
        }

       
        System.out.print("removed duplicates from unsorted array=");
        
           for(int i=0;i<dig;i++){       

            boolean isduplicate=false;

            for(int j=i+1;j<dig;j++){

              if(i!=j && arr[i]==arr[j]){
                isduplicate=true;
                 break;

              }  
            
            }
            if(isduplicate!=true){
            
             System.out.print(arr[i]+" ");
             
            }
        }

     sc.close();
    }
}
