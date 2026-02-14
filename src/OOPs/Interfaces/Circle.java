package OOPs.Interfaces;

public class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calcArea() {
        return Math.PI * this.radius * this.radius;
    }
}
