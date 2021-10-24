package Shildt.PART1.S186;

public class S170KonstruktorParametr {
    public static void main(String[] args) {


// объявить,   выделить память и  инициализировать объекты  типа Вох3
        Box3 mybox1 = new Box3(10, 20, 15);
        Box3 mybox2 = new Box3(3, 6, 9);

        double vol;

        vol = mybox1.volume();
        System.out.println("Oбъeм равен " + vol);
        vol = mybox2.volume();
        System.out.println("Oбъeм равен " + vol);
    }
}

class Box3 {
    double width;
    double height;
    double depth;

    //Конструктор
    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // рассчитать и  возвратить объем
    double volume() {
        return width * height * depth;
    }
}
