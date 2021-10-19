package com.rohit;

public class Pattern05 {
    public static void main(String[] args) {
        pattern5(5);
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int colsInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= colsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
