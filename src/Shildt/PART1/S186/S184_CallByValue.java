package Shildt.PART1.S186;

class Test2 {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}


public class S184_CallByValue {
    public static void main(String[] args) {

        int s = 1;

        switch (s) {

            case 1:
                Test2 ob = new Test2();
                int a = 15, b = 20;
                System.out.println("а и б до вызова; " + a + " " + b);
                ob.meth(a, b);
                System.out.println("а и б до после  вызова; " + a + " " + b);
                break;

            case 2:
                Test3 ob2 = new Test3(15, 20);
                System.out.println("ob.a и оЬ .Ь до вызова:   " + ob2.a + "  " + ob2.b);
                ob2.math(ob2);
                System.out.println("ob.a и оЬ .Ь после вызова:   " + ob2.a + "  " + ob2.b);
                break;
        }
    }
}

class Test3 {
    int a, b;

    Test3(int i, int j) {
        a = i;
        b = j;
    }

    void math(Test3 o) {
        o.a = o.a * 2;
        o.b = o.b / 2;
    }

}