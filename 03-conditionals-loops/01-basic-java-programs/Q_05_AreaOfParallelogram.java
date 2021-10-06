import java.util.Scanner;

public class Q_05_AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter height and base of the parallelogram: ");
        float height = in.nextFloat();
        float base = in.nextFloat();
        System.out.print("Area of the parallelogram = " + (base * height));
    }
}
