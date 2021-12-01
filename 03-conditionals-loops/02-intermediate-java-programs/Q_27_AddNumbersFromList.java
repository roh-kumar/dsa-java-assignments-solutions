import java.util.Scanner;

public class Q_27_AddNumbersFromList {
    public static void main(String[] args) {
        addNumbers();
    }
    static void addNumbers() {
        Scanner in = new Scanner(System.in);
        int nSum = 0, eSum = 0, oSum = 0;
        System.out.print("Enter the numbers to add: ");
        while (true) {
            int n = in.nextInt();
            if (n == 0) break;
            if (n < 0) nSum += n;
            else if (n % 2 == 0) eSum += n;
            else oSum += n;
        }
        System.out.println("Sum of negative numbers = " + nSum);
        System.out.println("Sum of positive even numbers = " + eSum);
        System.out.println("Sum of positive odd numbers = " + oSum);
    }
}
