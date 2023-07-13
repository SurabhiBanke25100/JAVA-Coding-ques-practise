//program to find second largest and secon smallest elemnet in arry

import java.util.*;

public class Q22 {


public static int largest(int arr[]){

    int max=Integer.MIN_VALUE;
    int sec_max=Integer.MIN_VALUE;

    for (int i=0;i<arr.length;i++){
       if(arr[i]>max){
        sec_max=max;
         max=arr[i];
       
       }    
     
     else if( arr[i]>sec_max  && arr[i]!=max ){

        sec_max=arr[i];

       }
    
    }
    
    return sec_max;

}


public static int smallest(int arr[]){

    int min=Integer.MAX_VALUE;
    int sec_min=Integer.MAX_VALUE;

    for (int i=0;i<arr.length;i++){
       if(arr[i]<min){
        sec_min=min;
         min=arr[i];
       
       }
    
     else if( arr[i]<sec_min  && arr[i]!=min ){

        sec_min=arr[i];

       }
    
    }
    
    return sec_min;

}

    
    public static int[] input(){
        
        Scanner sc = new Scanner(System.in);
        int dig=sc.nextInt();
        int arr[]=new int[dig];
        for(int i=0; i<dig ; i++){
            
           arr[i]=sc.nextInt();
            
        }
            return arr;
    }
    

    public static void main(String[]args){
    
      int arr[]=input();

      int c = largest(arr);
      System.out.println("second_largest="+c);

      int d = smallest(arr);
      System.out.println("second_smallest="+d);
               
        }

}
