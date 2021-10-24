package Shildt.PART2.S437;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Ограниченные метасимвольные аргументы
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker{}

@interface Single{
    int value();
}


class TwoD {
    int x, y;

    public TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class TreeD extends TwoD {
    int z;

    public TreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

class FourD extends TreeD {
    int t;

    public FourD(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }
}
@MyMarker
class Coords<T> {   //Этот класс хранит массив координатных объектов
    T[] coordS;

    public Coords(T[] o) {
        this.coordS = o;
    }
}

class BoundedWildcard {   //Продемонстрировать применение ограниченных метасимволов
    static void showXY(Coords<? extends TwoD> c) {
        System.out.println("Koopдинaты Х  У:");
        for (int i = 0; i < c.coordS.length; i++) System.out.println(c.coordS[i].x + " " + c.coordS[i].y);
        System.out.println();
    }

    static void showXYZ(Coords<? extends TreeD> c) {
        System.out.println("Koopдинaты Х  У  Z:");
        for (int i = 0; i < c.coordS.length; i++)
            System.out.println(c.coordS[i].x + " " + c.coordS[i].y + " " + c.coordS[i].z);
        System.out.println();
    }

    static void showALL(Coords<? extends FourD> c) {
        System.out.println("Koopдинaты Х   У  Z  T:");
        for (int i = 0; i < c.coordS.length; i++)
            System.out.println(c.coordS[i].x + " " + c.coordS[i].y + " " + c.coordS[i].z + " " + c.coordS[i].t);
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD td[] = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(18, 14),
                new TwoD(-1, -23),};
        Coords<TwoD> tdlocs = new Coords<>(td);
        System.out.println("Coдepжимoe  объекта tdlocs.");
        showXY(tdlocs);   //Верно,   это тип ТWoD
//        showXYZ(tdlocs);
//        showALL(tdlocs);
/**        а  теперь создать несколько  объектов типа FourD */
        FourD fd[] = {
                new FourD(1, 2, 3, 4),
                new FourD(6, 8, 14, 8),
                new FourD(22, 9, 4, 9),
                new FourD(3, -2, -23, 17)};
        Coords<FourD> fdlocs = new Coords<>(fd);
        System.out.println("Coдepжимoe  объекта fdlocs.");
        showXY(fdlocs);
        showXYZ(fdlocs);
        showALL(fdlocs);

    }
}