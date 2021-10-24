package Shildt.PART1.S228;

class Box {
    private double width;
    private double heidht;
    private double depth;

    Box(Box ob) {////??
        width = ob.width;
        heidht = ob.heidht;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        heidht = h;
        depth = d;
    }

    Box() {
        width = -1;
        heidht = -1;
        depth = -1;
    }

    Box(double len) { // kub
        len = heidht = width = depth;
    }

    double volume() {
        return width * heidht * depth;
    }
}
//////////////////////////////////////////
class BoxWeight extends Box {
    double weight; // вес параллелепипеда

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }
    BoxWeight(){
        super();
        weight = -1;
    }
    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
}

class ColorBox extends Box {
    int color;

    ColorBox(double w, double h, double d, int c) {
        super(w, h, d);
        color = c;
    }
}

class Shipment extends BoxWeight{
    double cost;

}

public class s212 {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double volume;

        volume = mybox1.volume();
        System.out.println("vol 1 = " + volume);
        System.out.println("weight 1 = " + mybox1.weight);
        System.out.println();


    }
}
