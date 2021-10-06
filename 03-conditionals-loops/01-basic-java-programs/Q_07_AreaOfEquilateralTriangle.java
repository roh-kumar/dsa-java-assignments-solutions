import java.util.Scanner;

public class Q_07_AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of the triangle: ");
        float side = in.nextFloat();
        System.out.print("Area of the equilateral triangle = " + (((Math.sqrt(3))/4) * side * side ));
    }
}
