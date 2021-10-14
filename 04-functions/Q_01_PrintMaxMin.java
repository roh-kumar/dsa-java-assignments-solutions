import java.util.Scanner;

public class Q_01_PrintMaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        System.out.println("Max = " + max(n1, n2, n3));
        System.out.println("Min = " + min(n1, n2, n3));
    }
    static int max(int n1, int n2, int n3) {
        int max = n1;
        if (max < n2) {
            max = n2;
        }
        if (max < n3) {
            max = n3;
        }
        return max;
    }
    static int min(int n1, int n2, int n3) {
        int min = n1;
        if (min > n2) {
            min = n2;
        }
        if (min > n3) {
            min = n3;
        }
        return min;
    }
}
