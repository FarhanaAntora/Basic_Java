/*Write a program to make a digital tasbih where the program counts each time user press enter until press 0 */
package com.Assignment02_WhileLoop;
import java.util.Scanner;
public class DigitalTasbih {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Enter count");

        while(true){
            String s=sc.nextLine();
            count=count+1;
            if(s.equals("0")) {
                break;
            }
            System.out.println(count);
        }
    }
}
