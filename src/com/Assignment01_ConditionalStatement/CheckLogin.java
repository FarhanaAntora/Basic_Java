/* Write a program to check if the provided user credentials are valid during login */

package com.Assignment01_ConditionalStatement;
import java.util.Scanner;
public class CheckLogin {
    public static void main(String[] args) {
        String username1 = "FARHANA";
        String password1 = "54879";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username");
        String username2 =s.next();
        System.out.println("Enter password");
        String password2 =s.next();
        if((username2.equals(username1)) && (password2.equals(password1))){
            System.out.println("Login successful");
        }
        else {
            System.out.println("Invalid username or password");
        }
    }
}
