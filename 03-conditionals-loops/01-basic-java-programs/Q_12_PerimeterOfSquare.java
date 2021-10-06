import java.util.Scanner;

public class Q_12_PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        float side = in.nextFloat();
        System.out.print("Perimeter of the square = " + (4 * side));
    }
}
