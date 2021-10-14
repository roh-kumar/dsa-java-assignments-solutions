import java.util.Scanner;

public class Q_02_CheckEvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to check odd or even: ");
        int n = in.nextInt();
        checkEvenOdd(n);
    }

    static void checkEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("The number is even!");
        } else {
            System.out.println("The number is odd!");
        }
    }
}
