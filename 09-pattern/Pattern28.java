package com.rohit;

public class Pattern28 {
    public static void main(String[] args) {
        pattern28(5);
    }

    static void pattern28(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int c = row > n ? 2 * n - row : row;
            int noOfSpaces = row > n ? row - n : n - row;
            for (int s = 1; s <= noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
