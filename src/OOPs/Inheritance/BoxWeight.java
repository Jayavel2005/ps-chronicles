package OOPs.Inheritance;

public class BoxWeight extends  Box{
    int weight;


    public BoxWeight(double l, double h, double w, int weight) {
        super(l, h, w);
        this.weight = weight;
    }
}
