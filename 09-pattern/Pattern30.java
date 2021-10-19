package com.rohit;

public class Pattern30 {
    public static void main(String[] args) {
        pattern30(5);
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            int c = row > n ? 2 * n - row : row;
            int noOfSpaces = row > n ? row - n : n - row;
            for (int s = 1; s <= noOfSpaces; s++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 2; col--) {
                System.out.print(col + " ");
            }
            for (int col = 1; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
