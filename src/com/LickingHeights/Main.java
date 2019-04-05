package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// declare
        Scanner input = new  Scanner(System.in);
        //initializing
        System.out.println("give me Your exact birthday starting with the\n Day");
        int h = input.nextInt();
        int q;
        do {
            System.out.println("\n Month");
            q = input.nextInt();
        } while (q<1|| q>12);
        System.out.println("\n the year ");
        int k = input.nextInt();
        int j = k/100;
        System.out.println("Day:"+h+"Month:"+q+"Year:"+k+"");
        Month( int q);
    Therightmonth();}
    public static int Month(int q ) {
        switch (q){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            }
    }

    public int void Therightmonth(int q ) {


    }
}