/*Write a program to get a number from the user and print whether it is positive or
negative.*/

package com.Assignment01_ConditionalStatement;
import java.util.Scanner;
public class MaxNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = s.nextInt();
        System.out.println("Enter second number");
        int num2 = s.nextInt();
        System.out.println("Enter third number");
        int num3 = s.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " max number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " max number");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " max number");
        }
    }
}


