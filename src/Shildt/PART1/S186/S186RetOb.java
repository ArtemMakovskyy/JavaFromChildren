package Shildt.PART1.S186;

public class S186RetOb {
    public static void main(String[] args) {

        TESTt ob1 = new TESTt(2);

        TESTt ob2;
        ob2 = ob1.inctByTen();

        System.out.println(ob1.a);
        System.out.println(ob2.a);

        ob2 = ob2.inctByTen();
        System.out.println(ob2.a);

    }
}

class TESTt {
    int a;

    TESTt(int i) {
        a = i;
    }

    TESTt inctByTen() {
        TESTt temp = new TESTt(a + 10);
        return temp;
    }
}