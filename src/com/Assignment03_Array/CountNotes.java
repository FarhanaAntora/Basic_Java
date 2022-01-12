//Find the number of notes from input amount in given array [1000,500,100,50,20,10,5,2]

package com.Assignment03_Array;

import java.util.Scanner;

public class CountNotes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount = sc.nextInt();
        CountNotes(amount);
    }

    public static void CountNotes(int amount) {

        int[] notes = {1000, 500, 100, 50, 20, 10, 5, 2};
        int n = notes.length;
        int[] noteCounter = new int[n];
        for (int i = 0; i < n; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }


        System.out.println("Notes count ");
        for (int j = 0; j < n; j++) {
            if (noteCounter[j] != 0) {
                System.out.println(notes[j] + " " + noteCounter[j]);
            }
           // System.out.println(notes[j] + " " + noteCounter[j]);
        }
    }
}







