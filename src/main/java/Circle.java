import java.util.Scanner;

/**
 * Created by Manas Dash on 17/11/17 8:13 PM.
 */
public class Circle extends Shape {

    private final double radius;
    private double pi = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this(1);
    }

    // A = π r^2
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    //The perimeter of a circle is called the circumference:
    //Circumference = 2π × radius
    public double getPerimeter() {
        return Math.PI * radius * radius;
    }
}