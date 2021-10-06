import java.util.Scanner;

public class Q_13_PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of the rhombus: ");
        float side = in.nextFloat();
        System.out.print("Perimeter of the rhombus = " + (4 * side));
    }
}
