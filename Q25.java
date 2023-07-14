//program to find reverse of an array

import java.util.Scanner;

public class Q25 {

    public static void printrevarray(int ans[],int n){

        System.out.print("rev array=");
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }

    }

    public static void revarray(int arr[],int n){

         int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
           ans[n-i-1]=arr[i];
        }
   
       printrevarray(ans,n);

    }

      public static int[] input(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter size=");
        int dig=sc.nextInt();

        int arr[]=new int[dig];
        for(int i=0; i<dig ; i++){
            
           arr[i]=sc.nextInt();
            
        }

        


            revarray(arr, dig);

         return arr;

        }

    public static void main(String[]args){
        
        int arr[]=input();
      
    }
}
