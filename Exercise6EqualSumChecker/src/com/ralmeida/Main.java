package com.ralmeida;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));
    }

    public static boolean hasEqualSum(int firstValue, int secondValue, int thirdValue) {

        if((firstValue + secondValue) == thirdValue){
            return true;
        } else {
            return false;
        }
    }
}
