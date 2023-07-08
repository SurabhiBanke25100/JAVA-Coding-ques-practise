
//q1 find the smallest no in array given by user

import java.util.*;

public class Q1{

    public static void main (String[]args){
      // int []arr={1,3,2,0};
      
      Scanner sc=new Scanner(System.in);
       System.out.print("enter the size of array=");
       int size=sc.nextInt();

       int []arr=new int[size];

       System.out.print("enter the elements of array:");
       for(int i=0;i<size;i++)
        {  
          arr[i]=sc.nextInt();
           
        }
          

        int min=arr[0];
       for(int i=0;i<4;i++){
    
        if(arr[i]<min){
            min=arr[i];
        }
       // System.out.println("smaller no="+ min);
    }
    System.out.println("smaller no="+ min);
}

}

    


    

       
    
