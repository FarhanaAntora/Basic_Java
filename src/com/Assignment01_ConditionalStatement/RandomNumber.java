/* Write a program to sum of random numbers */

package com.Assignment01_ConditionalStatement;
import java.util.Random;
import java.util.Scanner;
public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        Random r = new Random();
        int num1=r.nextInt(100);
        System.out.println(num1);
        int num2=r.nextInt(100);
        System.out.println(num2);
        sum=num1+num2;
        System.out.println(sum);
        System.out.println("Enter the output");
        int output= sc.nextInt();
        if(sum==output) {
            System.out.println("correct");
        }
        else{
            System.out.println("Wrong");
        }
    }
}
