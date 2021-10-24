package Shildt.Classes.IO.IO;

import java.io.*;

class MyClass implements Serializable {
    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return s + ", i=" + i +
                ", d=" + d;
    }
}

public class SerializationDemo767 {
    public static void main(String[] args) {
//        извести сериализацию объекта
        try (ObjectOutputStream objOstream =
                     new ObjectOutputStream(new FileOutputStream("setial"))) {
            MyClass object1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("object1 " + object1);


        } catch (IOException e) {
            e.printStackTrace();
        }
//        произвести  десериализацию объекта
        try (ObjectInputStream objIStream =
                     new ObjectInputStream(new FileInputStream("setial"))) {
    MyClass object2 = (MyClass) objIStream.readObject();
            System.out.println("object2 " + object2);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Исключение при десериализации:   "+e);
            System.exit(0);
        }

    }
}
