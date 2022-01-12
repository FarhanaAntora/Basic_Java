//Write a program to calculate difference between today and your birthday

package com.Assignment03_Array;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalculateDate {
    public static void main(String[] args) throws ParseException {
        String thatDay = "20-01-2004 09:10:01 AM";
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa");
        Date date1 = format.parse(thatDay);
        Date date2 = new Date();
        long d= date2.getTime()-date1.getTime();
        long year = d/(1000l*60*60*24*365);
        long day = d/(1000*60*60*24)%365;
        long hour = d/(1000*60*60)%24;
        long minute = d/(1000*60)%60;
        long second = d/(1000)%60;
        System.out.println("Year "+year);
        System.out.println("Day "+day);
        System.out.println("Hour "+hour);
        System.out.println("Minute "+minute);
        System.out.println("Second "+second);

    }
}
