package com.firstJava;

import java.util.Scanner;

public class Q_02_PrintGreeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hello " + name);
    }
}
