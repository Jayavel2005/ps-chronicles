package OOPs.Inheritance;

public class Box extends Object {
    double l, h, w;

    public Box() {
        this.l = this.h = this.w = -1;

    }

    //    cube
    public Box(double side) {
        this.l = this.w = this.h = side;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the box.");
    }
}
