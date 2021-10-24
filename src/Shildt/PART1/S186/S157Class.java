package Shildt.PART1.S186;

public class S157Class {
    public static void main(String[] args) {
        Box mybox = new Box();
        Box mybox2 = new Box();

        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        mybox2.setDim(3, 6, 9);

        int x = 3;
        switch (x) {
            case 1:
                // рассчитать объем параллелепипеда
                vol = mybox.width * mybox.height * mybox.depth;
                System.out.println("Oбъeм равен " + vol);

                vol = mybox2.width * mybox2.height * mybox2.depth;
                System.out.println("Oбъeм равен " + vol);
                break;
            case 2:
                mybox.volume();
                mybox2.volume();
                break;
            case 3:
                System.out.println(mybox.volumeReturn());
                break;
            case 4:
                System.out.println(mybox.square(5));
                break;
            case 5:
                System.out.println(mybox.square(2));
                break;

        }
    }
}

class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.println("Объем равен: " + (width * height * depth));
    }

    double volumeReturn() {
        return width * height * depth; // рассчитать и  возвратить объем
    }

    void setDim(double w, double h, double d) { // установить размеры параллелепипеда
        width = w;
        height = h;
        depth = d;
    }

    int square(int i) {
        return i * i;
    }


}

