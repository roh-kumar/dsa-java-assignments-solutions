import java.util.Scanner;

public class Q_11_PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length and breadth of the rectangle: ");
        float length = in.nextFloat();
        float breadth = in.nextFloat();
        System.out.print("Perimeter of the rectangle = " + (2 * (length + breadth)));
    }
}
