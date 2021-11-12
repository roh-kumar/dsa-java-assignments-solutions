import java.util.Scanner;

public class Q_25_SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int sum = 0;
        while(n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        System.out.println(sum);
    }
}
