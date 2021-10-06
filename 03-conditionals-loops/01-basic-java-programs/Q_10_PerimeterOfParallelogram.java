import java.util.Scanner;

public class Q_10_PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side and base of the parallelogram: ");
        float side = in.nextFloat();
        float base = in.nextFloat();
        System.out.print("Perimeter of the parallelogram = " + (2 * (base + side)));
    }
}
