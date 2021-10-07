import java.util.Scanner;

public class Q_24_PrintSumOfAllNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        int sum = 0;
        while (n != 0) {
            System.out.print("Enter a number or enter 0 to print sum of all inputs: ");
            n = in.nextInt();
            sum += n;
        }
        System.out.println("Sum of all inputs = " + sum);
    }
}
