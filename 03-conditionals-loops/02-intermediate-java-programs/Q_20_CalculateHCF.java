import java.util.Scanner;

public class Q_20_CalculateHCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers to find their HCF or GCD: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        while(num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("HCF = " + num1);
    }
}



