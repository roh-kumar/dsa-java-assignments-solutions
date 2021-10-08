import java.util.Scanner;

public class Q_05_DistanceBtwTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter coordinates of first point(x1,y1): ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.print("Enter coordinates of second point(x2,y2): ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        System.out.println("Distance between given two points = " + Math.sqrt( (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) ));
    }
}
