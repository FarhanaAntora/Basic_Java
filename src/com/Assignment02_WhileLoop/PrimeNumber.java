/*Write a program to show range of prime numbers from 2 to n using while loop [n is the number by user input]*/

package com.Assignment02_WhileLoop;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int i = 2;
        System.out.println("Range of prime numbers ");
        while (i <= num) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;

                }
            }
            if (count == 2) {

                System.out.println(i + " ");
            }
            i++;

        }
    }
}
