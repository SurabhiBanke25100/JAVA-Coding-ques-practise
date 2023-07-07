//Q2 find the largest no in an array as per given set of array by user

import java.util.*;

public class Q2 {
    
public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    System.out.print("enter the size of an array=");
    int size=sc.nextInt();

    int [] arr=new int[size];
    System.out.print("enter the elements in an array:");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }

    int max=arr[0];
    for(int i=0;i<size;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }

System.out.print("largest no in array:"+max);
}


}
