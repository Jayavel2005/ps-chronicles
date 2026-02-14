package OOPs.Interfaces;

public class Main {

    private static Car car;

    public static void main(String[] args) {
//        Car car = new Car();
//        car.acc();

        Circle s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);
        Shape s3 = new Square(3);

        System.out.println(s1.calcArea());
        System.out.println(s2.calcArea());
        System.out.println(s3.calcArea());

    }
}
