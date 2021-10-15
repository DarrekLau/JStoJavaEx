package com.darrek;

import java.util.Scanner;

public class dayNumber {

    static private Integer janFirstDayNumber;
    static private Integer yearDayNumber;

    public dayNumber(){
        //empty constructor
    }

    public static void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the Jan Day Number: ");
        janFirstDayNumber = scanner.nextInt();
        System.out.print("Please enter the Year Day Number: ");
        yearDayNumber = scanner.nextInt();
    }

    public static void print(){
        System.out.println("The day of the week is "+ ((yearDayNumber + janFirstDayNumber) % 7));
    }

    public static void checkDayNumber(){
        if (((yearDayNumber + janFirstDayNumber) % 7) == 0)
            print();
        else if (((yearDayNumber +
                janFirstDayNumber) % 7) == 1){
            print();}
        else if (((yearDayNumber +
                janFirstDayNumber) % 7) == 2){
            print();}
        else if (((yearDayNumber +
                janFirstDayNumber) % 7) == 3){
            print();}
        else if (((yearDayNumber +
                janFirstDayNumber) % 7) == 4){
            print();}
        else if (((yearDayNumber +
                janFirstDayNumber) % 7) == 5){
            print();}
        else if (((yearDayNumber +
                janFirstDayNumber) % 7) == 6){
            print();}
    }
}
