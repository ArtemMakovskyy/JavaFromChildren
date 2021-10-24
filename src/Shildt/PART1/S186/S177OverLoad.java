package Shildt.PART1.S186;

class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют ");
    }


    void test(int a, int b) {
        System.out.println(a + " "+b);
    }

void  test (double a){
    System.out.println("Внутреннее преобразование при вызове test(double) a: "+a);
}

}

class S177OverLoad {
    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
       int i = 88;
       od.test();
       od.test(10,20);
       od.test(i);
       od.test(123.2);

    }
}