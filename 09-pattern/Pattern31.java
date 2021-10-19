package com.rohit;

public class Pattern31 {
    public static void main(String[] args) {
        pattern31(5);
    }

    static void pattern31(int n) {
        int originalN = n;
        n = (2 * n) - 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row - 1, col - 1), Math.min((n - col), (n - row)));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
