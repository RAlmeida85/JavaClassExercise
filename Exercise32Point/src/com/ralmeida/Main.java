package com.ralmeida;
//    TEST EXAMPLE
//
//    → TEST CODE:
//
//    Point first = new Point(6, 5);
//    Point second = new Point(3, 1);
//    System.out.println("distance(0,0)= " + first.distance());
//    System.out.println("distance(second)= " + first.distance(second));
//    System.out.println("distance(2,2)= " + first.distance(2, 2));
//    Point point = new Point();
//    System.out.println("distance()= " + point.distance());
//
//    OUTPUT
//
//    distance(0,0)= 7.810249675906654
//    distance(second)= 5.0
//    distance(2,2)= 5.0
//    distance()= 0.0
//
//    NOTE: Use Math.sqrt to calculate the square root √.
//
//    NOTE: Try to avoid duplicated code.
//
//    NOTE: All methods should be defined as public NOT public static.
//
//    NOTE: In total, you have to write 7 methods.
//
//    NOTE: Do not add a main method to the solution code.


public class Main {

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
