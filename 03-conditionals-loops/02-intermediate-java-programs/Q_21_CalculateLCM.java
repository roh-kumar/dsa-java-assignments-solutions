import java.util.Scanner;

public class Q_21_CalculateLCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers to find their LCM: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int a = num1;
        int b = num2;
        while(num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        int lcm = a * b /num1;
        System.out.println("LCM = " + lcm);
    }
}
