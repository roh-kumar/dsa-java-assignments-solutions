public class Q_18_PalindromeOrNot {
    public static void main(String[] args) {
        int n = 123421;
        int temp = n;
        int res = 0;
        while (n > 0) {
            int rem = n % 10;
            res = res * 10 + rem;
            n = n / 10;
        }
        if (temp == n) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
