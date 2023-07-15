import java.util.*;

public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the coefficients of the quadratic equation (a, b, c): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double d = b * b - 4 * a * c;

        System.out.println("Discriminant (d): " + d);

        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and different:");
            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);
        } else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("Roots are real and equal:");
            System.out.println("r = " + r);
        } else {
            System.out.println("Roots are complex and imaginary.");
        }

        sc.close();
    }
}
