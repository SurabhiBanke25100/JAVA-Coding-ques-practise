//program to check if array is a subset of another array or not

import java.util.*;

public class Q38 {
    
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> n1=new ArrayList<>();
        ArrayList<Integer> n2=new ArrayList<>();


        System.out.print("enter size=");
        int  dig= sc.nextInt();

        //int  arr1[]=new int[dig];
        // int arr2[]=new int[dig];

        System.out.print("enter the array 1 elements=");
         
        for(int i=0;i<dig;i++){

            n1.add(sc.nextInt());

        }

        System.out.print("enter size=");

        int  dig1= sc.nextInt();

        System.out.print("enter the array 2 elements=");
         
        for(int j=0;j<dig1;j++){

            n2.add(sc.nextInt());

        }  

        boolean present=false;
              for(int num:n1){        

                if(!n2.contains(n1)){             //using for each loop : checking whether all elements of arr2(n2) is present in arr1(n1) or not
                   present=true;
                   break;

                }
              }
        

                  if(present) 
                  {System.out.print("arr1 is subset of arr2");}

                  else{
                    System.out.print("arr1 is not the subset of arr2");
                  }
            
        
        

     sc.close();

    }
}
