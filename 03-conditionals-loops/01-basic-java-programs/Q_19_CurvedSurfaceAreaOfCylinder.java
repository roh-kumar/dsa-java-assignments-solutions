import java.util.Scanner;

public class Q_19_CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius and height of the cylinder: ");
        float r = in.nextFloat();
        float h = in.nextFloat();
        System.out.print("Curved surface area of the cylinder = " + (2 * 3.14 * r * h));
    }
}
