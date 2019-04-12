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
        do { System.out.println("\n Month");
            q = input.nextInt();
        } while (q<1|| q>12);
        System.out.println("\n the year ");
        int k = input.nextInt();
        int j = k/100;
        System.out.println("Day:"+h+"Month:"+q+"Year:"+k+" ");
        Month(q);
    }
    public static void Month(int q ) {
        //Declare
        String J,F,M,A,Ma,Jn,Jy,Au,S,N,O,D;
        //initialize
        J  = "January";
        F  = "February";
        M  = "March";
        A  = "April";
        Ma = "May";
        Jn = "June";
        Jy = "July";
        Au = "August";
        S  = "September";
        N  = "November";
        O  = "October";
        D  = "December";



        switch (q){
            case 1:
                System.out.println(J);
                break;
            case 2:
                System.out.println(F);
                break;
            case 3:
                System.out.println(M);
                break;
            case 4:
                System.out.println(A);
                break;
            case 5:
                System.out.println(Ma);
                break;
            case 6:
                System.out.println(Jn);
                break;
            case 7:
                System.out.println(Jy);
                break;
            case 8:
                System.out.println(Au);
                break;
            case 9:
                System.out.println(S);
                break;
            case 10:
                System.out.println(N);
                break;
            case 11:
                System.out.println(O);

            break;
            case 12:
                System.out.println(D);
                default:

            }


    }


}