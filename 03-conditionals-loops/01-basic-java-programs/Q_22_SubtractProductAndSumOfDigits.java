import java.util.Scanner;

public class Q_22_SubtractProductAndSumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int product = 1;
        int sum = 0;
        while(num != 0) {
            int digit = num % 10;
            product *= digit;
            sum += digit;
            num /= 10;
        }
        int difference = product - sum;
        System.out.println("The result = " + difference);
    }
}
