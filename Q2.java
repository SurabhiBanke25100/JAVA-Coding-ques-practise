//program to find the largest no in an array

import java.util.Scanner;

public class Q2 {
    
    public static void main(String [] args){
    
        Scanner sc=new Scanner(System.in);
        int n,size,max;
        int s=Integer.MIN_VALUE;

        System.out.print("enter size=");
        size=sc.nextInt();

        int []arr=new int[size];

        System.out.print("enter elements of an array=");
        for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();

        }

        max=arr[0];


        for (int i=0;i<size;i++){
          // min=arr[0];
           while(arr[i]>max){
              
               max=arr[i];

           }
       }
        System.out.println("largest no="+max);

        for (int i=0;i<size;i++){
          // min=arr[0];
           while(max>s){
              
               max=arr[i];

           }
       }
        
        

        
    


sc.close();

    }
}
