package Shildt.PART2.Annotacii.T1;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // p 346
@interface Info{
    String str() default  "my info";
}
@Deprecated
@Info
class OneD {
    int x;

    public OneD(int x) {
        this.x = x;
    }
}
@Info(str = "Три д объект")
class TreeD extends OneD {
    int y, z;

    public TreeD(int x, int y, int z) {
        super(x);
        this.y = y;
        this.z = z;
    }
}

class Coords<T> {
    T[] ob;

    public Coords(T[] ob) {
        this.ob = ob;
    }
}

public class TestTreeD {

    static void showD(Coords<? extends OneD> o) {
        for (int i = 0; i < o.ob.length; i++) {
            System.out.print(o.ob[i].x + "/ ");
        }
        System.out.println();
    }

    static void show3D(Coords<? extends TreeD> o) {
        for (int i = 0; i < o.ob.length; i++) {
            System.out.print(o.ob[i].x + ", " + o.ob[i].y + ", " + o.ob[i].z + "/ ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        OneD[] oneD = {
                new OneD(1), new OneD(2), new OneD(3),
        };
        Coords<OneD> groupOneD = new Coords<>(oneD);
        showD(groupOneD);

        TreeD[] treeD = {
                new TreeD(3, 4, 6), new TreeD(2, 4, 7),
        };
        Coords<TreeD> groupTreeD = new Coords<>(treeD);
        show3D(groupTreeD);
    }
}

class SomeClass{

    int myOne( SomeClass this, int i) {
        return 0;
    }
}