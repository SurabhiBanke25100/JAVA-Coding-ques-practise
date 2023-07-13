import java.util.Scanner;
public class Q21 {


    public static int sum(int arr[]){
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

        }

      // System.out.print("sum="+sum);

        return sum;
    }

    public static int  Maxm(int arr[]){
       int min=Integer.MAX_VALUE;   
       for (int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
       }
         System.out.print("min value="+min);

       return min;
    }
    
    public static int[] input(){
        
        Scanner sc=new Scanner(System.in);
        int dig=sc.nextInt();
        int arr[]=new int[dig];
        for(int i=0;i<dig;i++){
            
           arr[i]=sc.nextInt();
            
        }
            return arr;
    }
    
    public static void prnt(int arr[]){
        
        
        for(int i=0;i<arr.length;i++){

        System.out.println("array ele="+arr[i]);

        }
        
    }
    
    public static void main(String args[]) {
      
        int arr[]=input();
        
         //prnt(arr);

         //Maxm(arr);
        // int c=sum(arr);
         //System.out.print("sum="+c);
     
    }
}


