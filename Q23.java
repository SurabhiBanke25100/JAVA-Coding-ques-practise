//program to search an element in an array
import java.util.*;

public class Q23 {

    public static int search(int arr[],int n){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("number found");
              return i;
            }
            
        }

        return -1;
    }

public static int[] input(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter size=");
        int dig=sc.nextInt();

        int arr[]=new int[dig];
        for(int i=0; i<dig ; i++){
            
           arr[i]=sc.nextInt();
            
        }

           return arr;
    
        }

    
    public static void main(String []args){

      Scanner sc = new Scanner(System.in); 
      
      int arr[]=input();

      System.out.print("enter no to be searched out=");
      int n=sc.nextInt();
      
        int c=search(arr,n);

        //System.out.println("number found");

    }
}
