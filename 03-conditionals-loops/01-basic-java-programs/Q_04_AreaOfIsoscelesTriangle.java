import java.util.Scanner;

public class Q_04_AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base and side of the triangle: ");
        float base = in.nextFloat();
        float side = in.nextFloat();
        System.out.print("Area of the isosceles triangle = " + (0.25 * base * Math.sqrt((4 * side * side)-(base * base))));
    }
}
