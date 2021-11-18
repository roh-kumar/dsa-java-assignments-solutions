import java.util.Scanner;

public class Q_05_ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        product(num1, num2);
    }
    static void product (int num1, int num2) {
        System.out.println("Product = " + (num1 * num2));
    }
}
