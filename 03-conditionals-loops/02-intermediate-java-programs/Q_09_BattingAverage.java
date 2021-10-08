import java.util.Scanner;

public class Q_09_BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the runs scored by the batsman: ");
        int runs = in.nextInt();
        System.out.print("Enter the number of times batsman was out: ");
        int out = in.nextInt();
        System.out.println("Batting average = "+(runs/out));
    }
}
