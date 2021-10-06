package com.firstJava;

import java.util.Scanner;

public class Q_06_RupeesToUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount in Rupees: ");
        int inr = in.nextInt();
        System.out.println("The amount in USD= " + (float)(inr*0.0133336));
    }
}
