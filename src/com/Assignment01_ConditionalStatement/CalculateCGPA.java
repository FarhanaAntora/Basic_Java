/* Write a program to calculate CGPA and find grade */

package com.Assignment01_ConditionalStatement;
import java.util.Scanner;
public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalMarks = 0.0;
        double credit = 3.0;
        double totalCredit = 0.0;
        double CGPA;
        double[] marks = new double[6];
        for (int i = 0; i < 6; i++) {

            System.out.println("Enter marks");
            marks[i] = calculateCGPA(sc.nextDouble());

            totalMarks = totalMarks + (marks[i] * credit);
            totalCredit = totalCredit + credit;
        }
        CGPA = totalMarks / totalCredit;
        System.out.println("CGPA" + CGPA);
    }

    public static double calculateCGPA(double mark) {
        if (mark >= 90) {
            return 4.00;
        } else if (mark >= 85) {
            return 3.7;
        } else if (mark >= 80) {
            return 3.3;
        } else if (mark >= 75) {
            return 3.0;
        } else if (mark >= 70) {
            return 2.7;
        } else if (mark >= 65) {
            return 2.3;
        } else if (mark >= 60) {
            return 2.0;
        } else if (mark >= 55) {
            return 1.3;
        } else if (mark >= 52) {
            return 1.0;
        } else if (mark >= 50) {
            return 0.7;
        } else if (mark < 50) {
            return 0.0;
        } else {
            return (0);
        }
    }
}



