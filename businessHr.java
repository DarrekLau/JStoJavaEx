package com.darrek;

import java.util.Scanner;

public class businessHr {

    static private Integer dayNumber;
    static private Integer hourNumber;

    public businessHr(){
        //empty constructor
    }

    public static void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the day: ");
        dayNumber = scanner.nextInt();
        System.out.print("Please enter the hour (in 0 to 24): ");
        hourNumber = scanner.nextInt();
    }

    public static void checkOperating(){

        if (hourNumber >= 9 && hourNumber <= 18){
                   switch (dayNumber) {

                case 0 -> System.out.println("Sunday, this is not a working day");
                case 1 -> System.out.println("Monday, this is a working day");
                case 2 -> System.out.println("Tues, this is a working day");
                case 3 -> System.out.println("Wed, this is a working day");
                case 4 -> System.out.println("Thurs, this is  a working day");
                case 5 -> System.out.println("Fri, this is  a working day");
                case 6 -> System.out.println("Sat, this is not a working day");
                default -> System.out.println("invalid day");
            }
    }
        else {
            System.out.println("This is not a business day");
        }
        }

    }


