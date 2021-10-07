import java.util.Scanner;

public class Q_17_VolumeOfSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        float r = in.nextFloat();
        System.out.print("Volume of the sphere = " + ((4 * 3.14 * r * r * r)/3));
    }
}
