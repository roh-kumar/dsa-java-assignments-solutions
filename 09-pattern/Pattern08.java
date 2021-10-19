package com.rohit;

public class Pattern08 {

    public static void main(String[] args) {
        pattern8(5);
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            int noOfSpaces = n - row;
            for (int col = 1; col <= noOfSpaces; col++) {
                System.out.print("  ");
            }
            int noOfStars = 2 * row - 1;
            for (int col = 1; col <= noOfStars; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
