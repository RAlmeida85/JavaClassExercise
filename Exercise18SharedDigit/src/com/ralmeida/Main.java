package com.ralmeida;

public class Main {

//    Write a method named hasSharedDigit with two parameters of type int.
//
//    Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
//
//    The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
//
//
//    EXAMPLE INPUT/OUTPUT:
//
//      * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
//
//      * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
//
//      * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
//
//
//    NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.
//
//    NOTE: Do not add a main method to the solution code.

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 38));
    }

    public static boolean hasSharedDigit (int firstValue, int secondValue){
        boolean result = false;
        if ((firstValue < 10 || firstValue > 99) || (secondValue < 10 || secondValue > 99)) {
            result = false;
        } else {
            int firstDigit, secondDigit;
            secondDigit = firstValue % 10;
            firstValue/= 10;
            firstDigit = firstValue % 10;

            while (secondValue > 0) {
                int digit = secondValue % 10;
                secondValue /= 10;

                if (digit == firstDigit || digit == secondDigit){
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
