import java.util.Scanner;

public class Q_13_PrintPrimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a range to print primes: ");
        int start = in.nextInt();
        int end = in.nextInt();
        printPrime(start, end);
    }
    static void printPrime(int s, int e) {
        if (s == 1) {
            System.out.println(s);
            s++;
            if (e >= 2) {
                System.out.println(s);
                s++;
            }
        }
        if (s == 2)
            System.out.println(s);
        if (s % 2 == 0)
            s++;
        for (int i = s; i <= e; i = i + 2) {
            int flag = 1;
            for (int j = 2; j * j <= i; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }
}
