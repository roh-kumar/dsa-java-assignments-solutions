package com.rohit;

public class Pattern11 {
    public static void main(String[] args) {
        pattern11(5);
    }

    static void pattern11(int n) {
        for (int row = 1; row <= n; row++) {
            int noOfStars = n - row + 1;
            int noOfSpaces = n - noOfStars;
            for (int col = 1; col <= noOfSpaces; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= noOfStars; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
