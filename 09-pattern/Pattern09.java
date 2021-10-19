package com.rohit;

public class Pattern09 {
    public static void main(String[] args) {
        pattern9(5);
    }

    static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {
            int noOfSpaces = (row - 1);
            int noOfStars = (2 * n - 1) - (2 * noOfSpaces);
            for (int col = 1; col <= noOfSpaces; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= noOfStars; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
