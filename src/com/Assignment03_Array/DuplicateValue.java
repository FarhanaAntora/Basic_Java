//Write a program to find if any element is duplicate. If duplicate, show the value.

package com.Assignment03_Array;
import java.util.Scanner;
public class DuplicateValue {
    public static void main(String[] args) {
        int[] num = {7, 100, 2, 8, 4, 100, 5, 10, 5, 8};
        int i;
        System.out.println("Duplicate values ");
        for (i = 0; i < num.length; i++) {
            int j = 0;
            for (j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.println( num[i]);
                }
            }
        }

    }
}
