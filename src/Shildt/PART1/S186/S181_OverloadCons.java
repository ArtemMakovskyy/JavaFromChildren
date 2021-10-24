package Shildt.PART1.S186;

class Boxxx {
    double width, height, depth;

    Boxxx(double w, double h, double d) { // конструктор , используемый при указании всех размеров
        width = w;
        height = h;
        depth = d;
    }

    Boxxx() { // конструктор, используемый , когда  ни один из размеров не указан
        width = -1; // использовано -1 для обознач. неиницилиз. паралелепипеда
        height = -1;
        depth = -1;
    }

    Boxxx(double len) { //используемый , используемый при создании куба
        width = height = depth = len;
    }

    double volume() {//рассчитать и  возвратить объем
        return width * height * depth;
    }
}


public class S181_OverloadCons {
    public static void main(String[] args) {
        Boxxx mb1 = new Boxxx(10,20,15);
        Boxxx mb2 = new Boxxx();
        Boxxx mb3 = new Boxxx(7);

        double vol;

        vol = mb1.volume();
        System.out.println(vol);

        vol = mb2.volume();
        System.out.println(vol);

        vol = mb3.volume();
        System.out.println(vol);


    }
}
