public class Pattern26 {
    public static void main(String[] args) {
        pattern26(6);
    }

    static void pattern26(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
