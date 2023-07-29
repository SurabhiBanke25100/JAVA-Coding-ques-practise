//program to find  permutations in which N people can occupy R seats.

import java.util.*;

public class Q58 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r;

        System.out.print("Enter the value of N: ");
        n = sc.nextInt();
        System.out.print("Enter the value of R: ");
        r = sc.nextInt();

        int factN = 1;
        int factNR = 1;

        // Calculate factorial of N
        for (int i = n; i >= 1; i--) {
            factN *= i;
        }

        // Calculate factorial of (N-R)
        int nMinusR = n - r;
        for (int i = nMinusR; i >= 1; i--) {
            factNR *= i;
        }

        // Calculate permutation
        int permutation = factN / factNR;

        System.out.println("Permutations: " + permutation);

        sc.close();
    }
}
