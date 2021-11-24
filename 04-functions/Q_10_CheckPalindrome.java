import java.util.Scanner;

public class Q_10_CheckPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = in.nextInt();
        System.out.println(isPalindrome(n));
    }
    static int reverseDigits(int num)
    {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }
    static boolean isPalindrome(int n)
    {
        int rev_n = reverseDigits(n);
        if (rev_n == n)
            return true;
        return false;
    }
}
