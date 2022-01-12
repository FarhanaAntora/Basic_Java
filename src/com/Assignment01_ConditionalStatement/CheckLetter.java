/*Write a program to check if inputted letter is small or capital
*/

package com.Assignment01_ConditionalStatement;
import java.util.Scanner;
public class CheckLetter {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character");
        char c = s.next().charAt(0);
        if ((c >= 'A') && (c <= 'Z')) {
            System.out.println("Capital letter");
        } else if ((c >= 'a') && (c <= 'z')) {
            System.out.println("Small letter");
        }
    }
}



