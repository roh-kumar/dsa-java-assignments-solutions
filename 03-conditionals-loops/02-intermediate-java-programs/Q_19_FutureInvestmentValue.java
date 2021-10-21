import java.util.Scanner;

public class Q_19_FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the present value: ");
        double presentValue = in.nextDouble();
        System.out.print("Enter the interest paid by the investment: ");
        double interest = in.nextDouble();
        System.out.print("Enter the number of period the investment will be held: ");
        double numberOfPeriods = in.nextDouble();
        double futureValue = presentValue * Math.pow(1 + interest / 100, numberOfPeriods);
        System.out.printf("%.2f", futureValue);
    }
}
