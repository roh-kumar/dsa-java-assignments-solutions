import java.util.Scanner;

public class Q_06_CommissionPercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = in.nextInt();
        System.out.print("Enter the commission percentage: ");
        int cpercent = in.nextInt();
        System.out.println("Commission amount = " + ((amount * cpercent)/100));
    }
}
