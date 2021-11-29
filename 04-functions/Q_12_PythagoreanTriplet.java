import java.util.Scanner;

public class Q_12_PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        checkPythagoreanTriplet(num1, num2, num3);
    }
    static void checkPythagoreanTriplet(int num1, int num2, int num3) {
        if((Math.pow(num1, 2) + Math.pow(num2, 2)) == Math.pow(num3, 2)) {
            System.out.println("Given triplet is a Pythagorean Triplet!");
        } else {
            System.out.println("Given triplet is not a Pythagorean Triplet!");
        }
    }
}
