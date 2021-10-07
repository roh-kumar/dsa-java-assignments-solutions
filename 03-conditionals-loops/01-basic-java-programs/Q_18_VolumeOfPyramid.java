import java.util.Scanner;

public class Q_18_VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length, width and height of the pyramid: ");
        float l = in.nextFloat();
        float w = in.nextFloat();
        float h = in.nextFloat();
        System.out.print("Volume of the pyramid = " + ((l * w * h)/3));
    }
}
