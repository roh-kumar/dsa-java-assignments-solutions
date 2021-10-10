import java.util.Scanner;

public class Q_11_CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter the rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter the time: ");
        double time = input.nextDouble();
        System.out.print("Enter number of times interest is compounded: ");
        int number = input.nextInt();
        double cInterest = principal * (Math.pow((1 + rate/100), (time * number))) - principal;
        System.out.println("Compound Interest = " + cInterest);
   }
}
