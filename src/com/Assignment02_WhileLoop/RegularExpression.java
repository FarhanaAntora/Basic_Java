/*1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk.
 Find total price and total quantity using regular expression. */

package com.Assignment02_WhileLoop;
import java.util.Scanner;
public class RegularExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk.";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] a = (str.split(" "));
        double quantity1 = Double.parseDouble(a[0]);
        double price1 = Double.parseDouble(a[1]);
        double quantity2 = Double.parseDouble(a[2]);
        double price2 = Double.parseDouble(a[3]);
        double quantity3 = Double.parseDouble(a[4]);
        double price3 = Double.parseDouble(a[5]);

        double quantity = quantity1 + quantity2 + quantity3;
        double price = price1 + price2 + price3;

        System.out.println("Total price " + price);
        System.out.println("Total quantity " + quantity);
    }
}
