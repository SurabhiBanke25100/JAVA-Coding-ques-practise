//print sum of N Natural no
import java.util.*;
class Q15 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no=");
        int n=sc.nextInt();
        
    int sum=0;
    
    for(int i=1;i<=n;i++){
        sum+=i;
        
    }
    System.out.print("sum of "+n+"="+ sum);
    
    sc.close();
    }
}