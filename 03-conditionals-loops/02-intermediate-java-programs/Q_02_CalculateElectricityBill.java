import java.util.Scanner;

public class Q_02_CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the units to calculate electricity bill: ");
        int u = in.nextInt();
        int bill = 0;
        if (u > 100) {
            bill += 100 * 10;
            u -= 100;
            if (u > 100) {
                bill += 100 * 15;
                u -= 100;
                if (u > 100) {
                    bill += 100 * 20;
                    u -= 100;
                    bill += u * 25;
                }
                else bill += u * 20;
            }
            else bill += u * 15;
        }
        else bill += u * 10;
        System.out.println("Electricity bill = " + bill);
    }
}
