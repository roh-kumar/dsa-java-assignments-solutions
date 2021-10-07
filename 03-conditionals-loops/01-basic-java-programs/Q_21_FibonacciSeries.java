import java.util.Scanner;

public class Q_21_FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of terms in fibonacci series: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = b;
            b += a;
            a = temp;
        }
    }
}
