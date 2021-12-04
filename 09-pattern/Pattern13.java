package com.rohit;

public class Pattern13 {
    public static void main(String[] args) {
        pattern13(5);
    }

    static void pattern13(int n) {
        for(int i = 1; i <= 5; i++){
            for(int j = i; j < 5; j++){
                System.out.print(" ");
            }
            for(int j = 1;j <= (2 * i - 1); j++){
                if(i == 5 || j == 1 || j == (2 * i - 1)){
                    System.out.print("*");
                }
			else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
