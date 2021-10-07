import java.util.Scanner;

public class Q_16_VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius and height of the cylinder: ");
        float r = in.nextFloat();
        float h = in.nextFloat();
        System.out.print("Volume of the cylinder = " + (3.14 * r * r * h));
    }
}
