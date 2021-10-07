import java.util.Scanner;

public class Q_20_TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the side of the cube: ");
        float side = in.nextFloat();
        System.out.print("Total surface area of the cube = " + (6 * side * side));
    }
}
