/*Create a math quiz program.
Scenario: 2 numbers will generate randomly and prompt user to input the summation of 2 numbers.
If user inputs the correct summation, print "Answer is correct" and user will get 1 point. if user inputs
wrong summation, then user will get 0 point. Finally after 5 iteration, total score will be shown. */

package com.Assignment02_WhileLoop;
import java.util.Random;
import java.util.Scanner;
public class MathQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int sum = 0;
        int point = 0;

        for (int i = 0; i < 5; i++) {
            int random1 = r.nextInt(100);
            int random2 = r.nextInt(100);

            sum = random1 + random2;
            System.out.println(sum);

            System.out.println("Enter the summation");
            int s = sc.nextInt();
            if (s == sum) {
                point++;
                System.out.println("Answer is correct");

            } else {
                System.out.println("Wrong answer");

            }
        }

        System.out.println("Total score " + point);

    }
}
