package Shildt.PART1.S247;

abstract class A5 {

//    abstract void callme();
    void callmetoo() {
        System.out.println("Этo конкретный метод ");
    }
}

class B5 extends A5 {
    void callme() {
        System.out.println("Peaлизaция метода callme() из класса В.");
    }
}

class S229AbstractDemo {
    public static void main(String[] args) {
        B5 b = new B5();

        System.out.println();
        b.callme();
        b.callmetoo();
    }
}
