import java.util.Scanner;

public class Q_04_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                System.out.print("Enter an operator (+,-,*,/,%): ");
        char ch = in.next().trim().charAt(0);
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
            System.out.print("Enter two numbers: ");
            int a = in.nextInt();
            int b = in.nextInt();
            if (ch == '+') {
                System.out.println(a+b);
            }
            if (ch == '-') {
                System.out.println(a-b);
            }
            if (ch == '*') {
                System.out.println(a*b);
            }
            if (ch == '%') {
                System.out.println(a%b);
            }
            if (ch == '/') {
                if (b != 0) {
                    System.out.println(a/b);
                }
                else {
                    System.out.println("Divide by zero error!");
                }
            }
        }
        else {
            System.out.println("Wrong input!");
        }
    }
}
