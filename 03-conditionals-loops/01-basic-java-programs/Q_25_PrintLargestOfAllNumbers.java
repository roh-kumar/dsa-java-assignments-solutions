import java.util.Scanner;

public class Q_25_PrintLargestOfAllNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        int largest = 0;
        while (n != 0) {
            System.out.print("Enter a number or enter 0 to print largest of all numbers: ");
            n = in.nextInt();
            if (largest < n) {
                largest = n;
            }
        }
        System.out.println("Largest of all inputs = " + largest);
    }
}
