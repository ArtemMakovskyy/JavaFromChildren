package Shildt.PART1.S228;

class A{
    int i;
     int j;

    void showIJ(){
        System.out.println(i + " / " + j);
        System.out.println();
    }
}

class B extends A {
    int k;

    void showK(){
        System.out.println("k= "+k);
    }

    void sumIJK(){
        int sum;
        sum = i+j+k;
        System.out.println(sum);
    }
}

public class S210Nasledovanie {
    public static void main(String[] args) {
        A supA = new A();
        B supB = new B();
        supA.i=1;
        supA.j=2;
        supA.showIJ();

        supB.i = 11;
        supB.j = 12;
        supB.k = 13;
        supB.sumIJK();

    }
}
