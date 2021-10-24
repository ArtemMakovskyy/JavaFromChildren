package Shildt.PART1.S186;

class Boxx {
    double width;
    double height;
    double depth;

    Boxx() {
        System.out.println("Конструктор объекта Boxx");
        width = 10;
        height = 10;
        depth = 10;
    }

    // рассчитать и  возвратить объем
    double volume() {
        return width * height * depth;
    }
}

public class S168Konstruktor {
    public static void main(String[] args) {
        // объявить,   выделить память и  инициализировать объекты типа Вох
        Boxx mybox1 = new Boxx();
        Boxx mybox2 = new Boxx();

        double vol;
        //получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Oбъeм равен" + vol);


        //получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Oбъeм равен" + vol);
    }

}