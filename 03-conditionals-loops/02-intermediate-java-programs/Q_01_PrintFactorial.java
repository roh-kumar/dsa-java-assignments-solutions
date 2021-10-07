import java.util.Scanner;

public class Q_01_PrintFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = in.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial = " + fact);
    }
}
