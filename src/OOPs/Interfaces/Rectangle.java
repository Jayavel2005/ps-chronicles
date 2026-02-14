package OOPs.Interfaces;

public class Rectangle implements Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calcArea() {
        return this.length * this.width;
    }
}
