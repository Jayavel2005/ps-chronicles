package OOPs.Inheritance;

public class BoxPrice extends  BoxWeight{
    int price;


    public BoxPrice(double l, double h, double w, int weight, int price) {
        super(l, h, w, weight);
        this.price = price;
    }
}
