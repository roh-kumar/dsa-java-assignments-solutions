package com.firstJava;

import java.util.Scanner;

public class Q_05_Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
}
