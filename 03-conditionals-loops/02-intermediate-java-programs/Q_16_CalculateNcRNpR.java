import java.util.Scanner;

public class Q_16_CalculateNcRNpR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = in.nextInt();
        System.out.print("Enter value of r: ");
        int r = in.nextInt();
        if (n >= r) {
            double ncr = factorial(n) / (factorial(r) * factorial(n - r));
            double npr = factorial(n) / factorial(n - r);
            System.out.println("The value of " + n + "p" + r + " is : " + ncr);
            System.out.println("The value of " + n + "c" + r + " is : " + npr);
        }
    }
    static double factorial(double n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
