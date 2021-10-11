import java.util.Scanner;

public class Q_13_AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println("Sum = " + (n1+n2));
    }
}
