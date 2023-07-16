//program to find increasing-decreasing order of elements in the array
import  java.util.*; 

public class Q35 {

    public static void main(String[]args){

    Scanner sc=new Scanner(System.in);

    int temp;
        System.out.print("enter size=");
        int  dig= sc.nextInt();
        int  arr[]=new int[dig];

        System.out.print("enter the array elements=");
         
        for(int i=0;i<dig;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Ascending order=");

        for(int i=0;i<dig;i++){       //ascending order

            for(int j=i+1;j<dig;j++){
                if(arr[i]>arr[j]){
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                }

            }

            System.out.print(arr[i]+" ");
        }

    System.out.println();
    System.out.print("descending order=");

        for(int i=0;i<dig;i++){        //descending order

            for(int j=i+1;j<dig;j++){
                if(arr[i]<arr[j]){
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                }

            }

            System.out.print(arr[i]+" ");
        }
       
sc.close();
    }
    
}
