package com._03ConditionalsAndLoops.intermediateJavaPrograms;

import java.util.Scanner;

public class Q_23_PerfectNumber {
    public static void main(String[] args) {
        int i, number, sum = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        for(i = 1 ; i < number ; i++) {
            if(number % i == 0)  {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.println("Perfect number!");
        }
        else {
            System.out.println("Not a Perfect number!");
        }
    }
}
