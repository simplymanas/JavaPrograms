import java.util.Scanner;

/**
 * Created by Manas Dash on 17/11/17 8:13 PM.
 */
public class Circle extends Shape {

    private   final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this(1);
    }

    public double getArea() {
        return Math.PI * 2 * radius;
    }

    //The perimeter of a circle is called the circumference:
    //Circumference = 2π × radius
    public double getPerimeter() {
        return Math.PI * radius * radius;
    }

}