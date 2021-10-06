import java.util.Scanner;

public class Q_03_SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principle, Rate, Time respectively: ");
        int p = in.nextInt();
        int r = in.nextInt();
        int t = in.nextInt();
        System.out.println((p * r * t) / 100);
        System.out.println();
    }
}
