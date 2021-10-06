import java.util.Scanner;

public class Q_09_PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of the triangle: ");
        float side = in.nextFloat();
        System.out.print("Perimeter of the equilateral triangle = " + (3 * side));
    }
}
