package com.ralmeida;

//    You have to represent a point in 2D space. Write a class with the name Point.
//    The class needs two fields (instance variables) with name x and y of type int.
//
//    The class needs to have two constructors. The first constructor does not have any
//    parameters (no-arg constructor). The second constructor has parameters x and y of type int
//    and it needs to initialize the fields.
//
//    Write the following methods (instance methods):
//    * Method named getX without any parameters, it needs to return the value of x field.
//    * Method named getY without any parameters, it needs to return the value of y field.
//    * Method named setX with one parameter of type int, it needs to set the value of the x field.
//    * Method named setY with one parameter of type int, it needs to set the value of the y field.
//    * Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
//    * Method named distance with two parameters x, y both of type int, it needs to return the distance between
//    this Point and Point x,y as double.
//    * Method named distance with parameter another of type Point, it needs to return the distance between
//    this Point and another Point as double.
//
//    How to find the distance between two points?To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
//
//    d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
//
//    Where √ represents square root.

public class Point {

    private int x;
    private int y;

    public double distance(Point p){
        return Math.sqrt(((p.getX()-this.getX()) * (p.getX() - this.getX())) + ((p.getY()-this.getY()) * (p.getY()- this.getY())));
    }

    public double distance(int x, int y){
        Point p = new Point(x,y);
        return distance(p);
    }

    public double distance(){
        Point p = new Point();
        return distance(p);
    }

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
