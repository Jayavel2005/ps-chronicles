package OOPs.Interfaces;

public class Square implements Shape {
    int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    public double calcArea() {
        return side * side;
    }
}
