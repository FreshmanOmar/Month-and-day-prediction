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
        System.out.println("Monday's child is fair of face,\n" + "Tuesday's child is full of grace,\n" + "Wednesday's child is full of woe,\n" + "Thursday's child has far to go.\n" + "Friday's child is loving and giving,\n" + "Saturday's child works hard for a living,\n" + "But the child born on the Sabbath Day,\n" + "Is fair and wise and good in every way.\n");
        do {System.out.println("Give me Your exact birthday starting with the\n");
        System.out.println("Day");
            q = input.nextInt();
        }while (q <1 || q > 31);

        do { System.out.println("\n Month");
            theMonth = input.nextInt();
        } while (theMonth < 1 || theMonth > 12);

        do {
            System.out.println("\n The Year ");
            K = input.nextInt();
        }while (K <999 || K > 9999);

        //System.out.println("Day:" + q + "Month:" + theMonth + "Year:" + K + " ");

        String WordMonth = Month(theMonth);
        System.out.println("you were Born "+WordMonth+" "+q+" "+K);


        h = birthDayOfWeek(q, theMonth, K);

       theday(h);
       String Day = theday(h);
       System.out.println("you were born on a "+Day+" ");

              NurseryRhyme(h);
        String Rhyme = NurseryRhyme(h);
              System.out.println(Rhyme);
    }

    public static String NurseryRhyme(int h) {
       switch(h){
           case 0:
               return"According to the nursery Rhyme you are Handsome " ;
           case 1:
               return"According to the nursery Rhyme you are Very graceful" ;
           case 2:
               return"According to the nursery Rhyme you are Gloomy" ;
           case 3:
               return"According to the nursery Rhyme you are still Growing" ;
           case 4:
               return"According to the nursery Rhyme you are Kind" ;
           case 5:
               return"According to the nursery Rhyme you are a Hard worker" ;
           case 6:
               return"According to the nursery Rhyme you are Amazing!" ;
       }

        return null;
    }

    public static int birthDayOfWeek (int day, int month, int year){
        if(month <=2){
            month = NumMonth(month);
            year --;
        }
        int J = year/100;
        int K =year%100;
        return (day + (13*(month+1))/5 + K + K/4 + J/4 +5*J)%7;
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