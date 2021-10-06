import java.util.Scanner;

public class Q_03_AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length and breadth of the rectangle: ");
        float length = in.nextFloat();
        float breadth = in.nextFloat();
        System.out.print("Area of the rectangle = " + (length * breadth));
    }
}
