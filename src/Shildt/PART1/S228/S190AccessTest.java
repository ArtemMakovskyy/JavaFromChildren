package Shildt.PART1.S228;

public class S190AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();
        ob.a = 10;
        ob.b = 20;
        ob.setC(100);
        System.out.println(ob.a+ob.b+ob.getC());

    }
}

class Test {
    int a;
    public int b;
    private int c;

    void setC(int i) {
        c = i;
    }

    int getC() {
        return c;
    }

}