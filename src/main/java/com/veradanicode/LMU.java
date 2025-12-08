package com.veradanicode;

public class LMU {
    public static void main(String[] args) {
        // Declare two numbers
        int num1 = 10;
        int num2 = 20;

        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Declare a third variable to facilitate the swap
        int temp;

        // Perform the swap
        temp = num1; // Store the value of num1 in temp
        num1 = num2; // Assign the value of num2 to num1
        num2 = temp; // Assign the value of temp (original num1) to num2

        System.out.println("\nAfter swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
