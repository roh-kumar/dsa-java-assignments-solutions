import java.util.Scanner;

public class Q_08_PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float r = in.nextFloat();
        System.out.print("Perimeter of the circle = " + (2 * 3.14 * r));
    }
}
