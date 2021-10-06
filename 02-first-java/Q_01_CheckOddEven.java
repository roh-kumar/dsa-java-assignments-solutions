import java.util.Scanner;

public class Q_01_CheckOddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check whether it's odd or even: ");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is Even");
        }
        else {
            System.out.println("The number is Odd");
        }
    }
}
