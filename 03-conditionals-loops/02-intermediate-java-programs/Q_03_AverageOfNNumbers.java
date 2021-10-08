import java.util.Scanner;

public class Q_03_AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
        int sum = 0;
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            sum += a;
        }
        System.out.println("Average of the given numbers = " + ((double)(sum)/(double)(n)));
    }
}
