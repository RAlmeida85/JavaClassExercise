package com.ralmeida;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.125, 3.125));
    }

    public static boolean areEqualByThreeDecimalPlaces (double firstValue, double secondValue) {

        int firstRound = (int) (firstValue * 1000);
        int secondRound = (int) (secondValue * 1000);

        if(firstRound == secondRound)
            return true;
        else
            return false;
    }
}
