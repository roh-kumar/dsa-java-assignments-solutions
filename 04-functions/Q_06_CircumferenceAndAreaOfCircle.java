import java.util.Scanner;

public class Q_06_CircumferenceAndAreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = in.nextInt();
        circumference(r);
        area(r);
    }
    static void circumference(double r) {
        double circumference = 2 * Math.PI * r;
        System.out.println("Circumference of the circle = " + circumference);
    }
    static void area (double r) {
        double area = Math.PI * r * r;
        System.out.println("Area of the circle = " + area);
    }
}
