/* Write a program to check balance and withdraw money from ATM booth using if else and
switch case */

package com.Assignment01_ConditionalStatement;
import java.util.Scanner;
public class CheckBalance {
    public static void main(String[] args) {
        check();
    }

    public static void check(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose 1 for withdraw");
        System.out.println("Choose 2 for balance");
        int option = sc.nextInt();
        int balance = 20000;

        switch (option) {
            case 1:
                System.out.println("Enter the amount you want to  withdraw");
                int withdraw = sc.nextInt();
                if (balance >= withdraw) {
                    balance = balance - withdraw;
                    System.out.println("Collect your money");
                    System.out.println("Your balance is "+balance);
                } else if (balance < withdraw) {
                    System.out.println("Insufficient balance");
                }

                break;

            case 2:
                System.out.println("Balance is " + balance);
                break;

        }
    }

}




