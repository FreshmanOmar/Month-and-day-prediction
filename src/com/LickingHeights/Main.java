package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // declare
        Scanner input = new Scanner(System.in);
        //initializing
        System.out.println("give me Your exact birthday starting with the\n Day");
        int h = input.nextInt();
        int q;
        do {
            System.out.println("\n Month");
            q = input.nextInt();
        } while (q < 1 || q > 12);
        System.out.println("\n the year ");
        int k = input.nextInt();
        int j = k / 100;
        System.out.println("Day:" + h + "Month:" + q + "Year:" + k + " ");
        String WordMonth = Month(q);
        System.out.println(WordMonth+" is the Month you were Born");
    }

    public static String Month(int q) {
        switch (q) {
            case 1:
                return "January";
            case 2:
               return "February";
            case 3:
               return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "November";
            case 11:
                return "October";
            case 12:
                return "December";
         default:
                return "unknown";

        }


    }


}