import java.util.Scanner;

public class Q_08_CalculateDepreciation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = in.nextInt();
        System.out.print("Enter depreciation percentage: ");
        int dpercent = in.nextInt();
        System.out.print("Enter the number of years: ");
        int year = in.nextInt();
        int temp = amount;
        for(int i = 0;i < year;i++)
            temp = ((100-dpercent) * temp)/100;
        System.out.println("After depreciation = "+ temp);
    }
}
