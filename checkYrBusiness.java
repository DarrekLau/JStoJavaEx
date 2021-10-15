package com.darrek;

import java.util.Scanner;

public class checkYrBusiness {

    static private Integer janFirstDayNumber;
    static private Integer yearDayNumber;
    static private Integer hourNumber;

    public checkYrBusiness(){
        //empty constructor
    }

    public static void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter First Day of Jan: ");
        janFirstDayNumber = scanner.nextInt();
        System.out.print("Please enter the number of the day in this year: ");
        yearDayNumber = scanner.nextInt();
        System.out.print("Please enter the hour (in 0 to 24): ");
        hourNumber = scanner.nextInt();
    }

    public static void printTrue(){
        System.out.println("true");
    }

    public static void printFalse(){
        System.out.println("false");
    }


    public static void checkYrDayHr(){

        if (((yearDayNumber +
                janFirstDayNumber) % 7) == 0 && hourNumber >= 9 && hourNumber <= 18){
         printFalse();}
        else if (((yearDayNumber +
                janFirstDayNumber) % 7) == 1 && hourNumber >= 9 && hourNumber <= 18){
        printTrue();}
        else if (((yearDayNumber +
                janFirstDayNumber) % 7) == 2 && hourNumber >= 9 && hourNumber <= 18){
        printTrue();}
        else if (((yearDayNumber +
                janFirstDayNumber) % 7) == 3 && hourNumber >= 9 && hourNumber <= 18){
        printTrue();}
        else if (((yearDayNumber +
                janFirstDayNumber) % 7) == 4 && hourNumber >= 9 && hourNumber <= 18){
        printTrue();}
        else if (((yearDayNumber +
                janFirstDayNumber) % 7) == 5 && hourNumber >= 9 && hourNumber <= 18){
        printTrue();}
        else if (((yearDayNumber +
                janFirstDayNumber) % 7) == 6 && hourNumber >= 9 && hourNumber <= 18){
        printFalse();}
        else {
            printFalse();}
    }

}
