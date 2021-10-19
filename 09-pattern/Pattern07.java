package com.rohit;

public class Pattern07 {

    public static void main(String[] args) {
        pattern7(5);
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            int noOfSpaces = row - 1;
            for (int col = 1; col <= noOfSpaces; col++) {
                System.out.print("  ");
            }
            int noOfStars = n - row + 1;
            for (int col = 1; col <= noOfStars; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
