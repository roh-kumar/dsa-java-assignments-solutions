import java.util.Arrays;
import java.util.Scanner;

public class Q_14_SumOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of numbers you want to add: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum);
    }
}
