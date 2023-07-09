//program to find the smallest no in an array

import java.util.Scanner;

public class Q1 {
    
    public static void main(String [] args){
    
        Scanner sc=new Scanner(System.in);
        int n,size,min;

        System.out.print("enter size=");
        size=sc.nextInt();

        int []arr=new int[size];

        System.out.print("enter elements of an array=");
        for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();

        }

min=arr[0];
       for (int i=0;i<size;i++){
          // min=arr[0];
           while(arr[i]<min){     //remember the condition  have to compare to min 

               min=arr[i];

           }
        
        System.out.println("smallest no="+min);
        }
        

        
    


sc.close();

    }
}
