import java.util.Scanner;

public class Q_15_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to check whether its armstrong: ");
        int n = in.nextInt();
        System.out.println(isArmstrong(n));
    }

    static boolean isArmstrong(int n) {
        int digits = 0;
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            int last = temp % 10;
            sum += Math.pow(last, digits);
            temp /= 10;
        }
        return sum == n;
    }

}
