package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // declare
        int h;//The Day of the week
        int q;//The Day of the Month
        int K;//The Year of the century
        int J;//The Zero based century
        int theMonth;//The Word Form of the Month
        Scanner input = new Scanner(System.in);
        //initializing
        System.out.println("give me Your exact birthday starting with the\n Day");
        q = input.nextInt();

        do { System.out.println("\n Month");
            theMonth = input.nextInt();
        } while (theMonth < 1 || theMonth > 12);

        System.out.println("\n the year ");
        K = input.nextInt();

        J = K/100;

        System.out.println("Day:" + q + "Month:" + theMonth + "Year:" + K + " ");

        String WordMonth = Month(theMonth);
        System.out.println(WordMonth+" is the Month, you were Born in "+K+" ");

       int m = NumMonth(theMonth);//the Number form of the month

        K =K%100;
       h = (q + (13*(m+1))/5 + K + K/4 + J/4 +5*J)%7;
       System.out.println(h);
       theday(h);
      String Day = theday(h);
              System.out.println("you were born a "+Day+" ");
    }

    public static String theday(int h) {
        switch(h){
            case 0:
               return "Saturday";
            case 1:
                return"Sunday";
            case 2:
                return"Monday";
            case 3:
                return"Tuesday";
            case 4:
                return"Wednesday";
            case 5:
                return"Thursday";
            case 6:
                return"Friday";
                }
        return null;
    }
    public static int NumMonth(int theMonth) {
        switch (theMonth) {
            case 1:
                return 13;
            case 2:
               return 14;
            case 3:
               return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
         default:
                return 0; }

    }

    public static String Month(int theMonth) {
        switch (theMonth) {
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
                return "unknown"; }

    }












































































}