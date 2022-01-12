/*Write a program to get a number from the user and print whether it is positive or
negative.*/

package com.Assignment01_ConditionalStatement;
import java.util.Scanner;

public class CheckNumber {

     public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");

        }
    }
}


