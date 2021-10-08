import java.util.Scanner;

public class Q_07_CalculatePower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.print("Enter the power of the number: ");
        int p = in.nextInt();
        int res = 1;
        while (p != 0) {
           res *= n;
           p--;
        }
        System.out.println("Result = " + res);
    }
}
