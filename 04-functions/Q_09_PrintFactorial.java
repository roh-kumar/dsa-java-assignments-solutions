import java.util.Scanner;

public class Q_09_PrintFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = in.nextInt();
        System.out.println("Factorial = " + fact(n));
    }
    static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
