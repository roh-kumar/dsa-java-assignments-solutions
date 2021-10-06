import java.util.Scanner;

public class Q_06_AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter both diagonals of the rhombus: ");
        float d1 = in.nextFloat();
        float d2 = in.nextFloat();
        System.out.print("Area of the rhombus = " + (0.5 * d1 * d2));
    }
}
