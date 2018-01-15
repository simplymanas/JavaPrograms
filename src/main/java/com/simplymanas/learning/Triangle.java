package com.simplymanas.learning;

/**
 * Created by Manas Dash on 17/11/17 8:37 PM.

 */
public class Triangle extends Shape {

   private final double side1, side2, side3;

   public Triangle(){
       this(1,1,1);
   }
    private Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        return getPerimeter() / 2;
    }
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        Shape shape = new Triangle(10,20,30);
        System.out.println(shape.getArea());
    }
}
