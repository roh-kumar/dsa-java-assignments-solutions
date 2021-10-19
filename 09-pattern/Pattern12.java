package com.rohit;

public class Pattern12 {

    public static void main(String[] args) {
        pattern12(5);
    }

    static void pattern12(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int noOfStars = row > n ? row - n : n - row + 1;
            int noOfSpaces = row > n ? n - (row - n) : n - (n - row + 1);
            for (int s = 1; s <= noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= noOfStars; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}