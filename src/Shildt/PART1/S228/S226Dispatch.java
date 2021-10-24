package Shildt.PART1.S228;

class A1 {
    void callme() {
        System.out.println("В меоде callme из класса А ");
    }
}

class B1 extends A1 {
    void callme() {
        System.out.println("В меоде callme из класса B ");
    }
}

class C1 extends A1 {
    void callme() {
        System.out.println("В меоде callme из класса C ");
    }
}

public class S226Dispatch {
    public static void main(String[] args) {
        A1 aaa = new A1();
        B1 bbb = new B1();
        C1 ccc = new C1();

        aaa.callme();
        bbb.callme();
        ccc.callme();
        System.out.println();

        A1 f;

        f = aaa;
        f.callme();

        f = bbb;
        f.callme();

        f = ccc;
        f.callme();

    }
}
