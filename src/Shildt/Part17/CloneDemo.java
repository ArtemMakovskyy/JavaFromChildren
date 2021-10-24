package Shildt.Part17;

/**
 * p534
 */
public class CloneDemo {


    public static void main(String[] args) {
        TestClone x1 = new TestClone();
        TestClone x2;
        x1.a = 10;
        x1.b = 20.98;
        x2 = x1.cloneTest(); //клонировать объект xl
        System.out.println("x1:   " + x1.a + " " + x1.b);
        System.out.println("x2:   " + x2.a + " " + x2.b);

        x2 = (TestClone) x1.clon();
        System.out.println("x1:   " + x1.a + " " + x1.b);
        System.out.println("x2:   " + x2.a + " " + x2.b);


    }
}


class TestClone implements Cloneable {
    int a;
    double b;
//    В  этом  ме тоде вызывается метод clone() из класса OЬject

    TestClone cloneTest() {
        try {
            return (TestClone) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Клoниpoвaниe невозможно .");
            return this;
        }
    }

    public Object clon() {
        try {
            return (TestClone) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Клoниpoвaниe невозможно .");
            return this;
        }
    }

}