package Shildt.PART1.S186;

class Box2 {
    double width, height, depth;

    // Обратите  внимание на этот конструктор
    // В  качестве параметра в  нем  используется объект  типа Вох
    Box2(Box2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.height;
    }

    // конструктор,  используемый при  указании всех размеров
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор,  используемый при создании куба
    Box2(double len) {
        len = width = height = depth;
    }

    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    double volume() {
        return width * height * depth;
    }
}


public class S183_OverloadCons2 {
    public static void main(String[] args) {
        Box2 mb1 = new Box2(10, 20, 15);
        Box2 mb2 = new Box2();
        Box2 mycube = new Box2(7);

        Box2 myclon_mb1 = new Box2(mb1);// создать копию

        double vol;

        // получить объем первого параллелепипеда
        vol = mb1.volume();
        System.out.println(vol);

        // получить объем второго параллелепипеда
        vol = mb2.volume();
        System.out.println(vol);

        // получить объем куба
        vol = mycube.volume();
        System.out.println(vol);

        // получить объем клона
        vol = myclon_mb1.volume();
        System.out.println(vol);

    }
}
