import java.util.Scanner;

public class Q_14_VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius and height of the cone: ");
        float r = in.nextFloat();
        float h = in.nextFloat();
        System.out.print("Volume of the cone = " + ((3.14 * r * r * h)/3));
    }
}
