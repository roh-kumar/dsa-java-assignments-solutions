import java.util.Scanner;

public class Q_01_AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float r = in.nextFloat();
        System.out.print("Area of the circle = " + (3.14 * r * r));
    }
}
