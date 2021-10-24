package Shildt.PART1.Reoeat;

class Box{
    double width;
    double height;
    double depth;

    Box(){
        width = 10;
        height = 10;
        depth = 10;
    }

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    double volume(){
        return width*height*depth;
    }
}

public class BoxDemo6 {
    public static void main(String[] args) {

        Box box1 = new Box();
        Box box2 = new Box(5,5,5);

        System.out.println(box1.volume());
        System.out.println(box2.volume());


    }
}
