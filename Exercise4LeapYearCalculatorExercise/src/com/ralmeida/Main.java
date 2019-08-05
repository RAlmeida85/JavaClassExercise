package com.ralmeida;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2100));
        System.out.println(isLeapYear(2500));
        System.out.println(isLeapYear(2017));

        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2400));
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(1996));
    }

    public static boolean isLeapYear (int year){
        boolean leapYear = false;

        if (year >= 1 && year <= 9999){
            if ((year % 4) == 0){
                if ((year % 100) == 0){
                    if ((year % 400) == 0) {
                        leapYear = true;
                    }
                } else {
                    leapYear = true;
                }
            }
        }
        return leapYear;
    }
}
