import java.util.Scanner;

public class Q_02_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter height and base of the triangle: ");
        float height = in.nextFloat();
        float base = in.nextFloat();
        System.out.print("Area of the triangle = " + (0.5 * base * height));
    }
}
