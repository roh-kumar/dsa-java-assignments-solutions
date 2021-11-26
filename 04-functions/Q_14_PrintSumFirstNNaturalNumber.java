import java.util.Scanner;

public class Q_14_PrintSumFirstNNaturalNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to print sum of first natural numbers: ");
        int n = in.nextInt();
        printSum(n);
    }
    static void printSum(int n) {
        int sum = n * (n + 1) / 2;
        System.out.println(sum);
    }
}
