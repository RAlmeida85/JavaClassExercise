package com.ralmeida;

public class Main {

    public static void main(String[] args) {
        System.out.println(isTeen(12));
        System.out.println(isTeen(13));
        System.out.println(isTeen(16));
        System.out.println(isTeen(20));

        System.out.println(hasTeen(10,13,25));
        System.out.println(hasTeen(25,19, 28));
        System.out.println(hasTeen(10, 25, 34));
    }

    public static boolean hasTeen (int firstValue, int secondValue, int thirdValue){
        if (isTeen(firstValue) || isTeen(secondValue) || isTeen(thirdValue)){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen (int value) {

        if (value >= 13 && value <= 19){
            return true;
        } else {
            return false;
        }
    }
}
