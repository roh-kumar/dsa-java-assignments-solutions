package com.rohit;

public class Pattern10 {
    public static void main(String[] args) {
        pattern10(5);
    }

    static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {
            int noOfStars = row;
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
