import java.util.Scanner;

public class Q_15_VolumeOfPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length, width and height of the prism: ");
        float l = in.nextFloat();
        float b = in.nextFloat();
        float h = in.nextFloat();
        System.out.print("Volume of the prism = " + (l * b * h));
    }
}
