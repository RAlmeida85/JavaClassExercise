package com.ralmeida;

public class Main {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean shouldWake = false;

        if (barking){
            if (hourOfDay >= 0 && hourOfDay <= 23)
                if (hourOfDay < 8 || hourOfDay > 22)
                    shouldWake = true;
        }

        return shouldWake;
    }
}
