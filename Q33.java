//program to find non-repeating elements in given array

import java.util.*;

public class Q33 {
    
  public static void main(String[]args){
     
    Scanner sc = new Scanner(System.in);
   
     System.out.print("enter size=");
    
     int dig=sc.nextInt();

    boolean visit[] =new boolean[dig];

    int arr[]=new int[dig];

     for(int i=0; i<dig; i++){
            
        arr[i]=sc.nextInt();
            
        }

     boolean  isduplicate;
     
     for(int i=0;i<dig;i++){
        isduplicate=false;
        
        for(int j=0;j<dig;j++){
         
            if(i!=j && arr[i]==arr[j]){

               isduplicate = true;
                break;
            }
            }
           
            if(isduplicate!=true){
            
             System.out.println(arr[i]+" ");
            }

       }
    

  }

}
