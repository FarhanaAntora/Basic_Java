/*Write a program that takes a year from user and print whether that year is a leap
year or not*/

package com.Assignment01_ConditionalStatement;
import java.util.Scanner;
public class LeapYear {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = s.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");

        }
    }
}

