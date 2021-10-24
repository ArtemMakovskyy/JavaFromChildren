package Shildt.Part17;

class X {
    int a;
    float b;
}

class Y extends X {
    double c;
}

public class RTTI {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Class<?> clObj;
        clObj = x.getClass(); // олучить ссылку на   объект  типа Class
        System.out.println("x -объект  типа: " + clObj.getName());
        clObj = y.getClass();
        System.out.println("y -объект  типа: " + clObj.getName());
        clObj = clObj.getSuperclass();
        System.out.println("Cyпepклacc  объекта у " + clObj.getName());
        System.out.println(Math.ulp(1/3));

    }
}
