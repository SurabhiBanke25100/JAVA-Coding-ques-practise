//program to print all prime nos in given range

import java.util.*;

public class Q6 {
    

public static void main(String[] args){

    int n,min,max;
Scanner sc=new Scanner(System.in);

 System.out.print("enter the min:");
      min=sc.nextInt();

      System.out.print("enter the max:");
      max=sc.nextInt();
       
      for(int i=min;i<=max;i++){
       
       boolean isprime=true;
      
       if(i<=1){
           isprime=false;
       }
       else{
        for(int j=2;j<=Math.sqrt(i);j++){

            if(i%j==0){
            isprime=false;
            break;

        }
       }
    

      }
      if(isprime){
      System.out.print(i+" ");
      }

sc.close();
    }
}
}
