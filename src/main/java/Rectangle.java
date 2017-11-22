/**
 * Created by Manas Dash on 18/11/17 6:34 AM.
 * Learning REST API
 */
public class Rectangle extends Shape {

    private  final double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(1,1);
    }

    public double getArea() {
        return 0;
    }

    //Perimeter = 2 × (w + h)
    public double getPerimeter() {
        return 2 * width * height;
    }
}
