package Shildt.PART1.S152;

public class S138For {
    public static void main(String[] args) {
        ForS140 forS = new ForS140();
        //       forS.forVar();
//        forS.forEch1();
        System.out.println();
 //       forS.forEch3();
//        forS.serchFor();
        VlogCikl vc = new VlogCikl();
        vc.nested();
        vc.nested2();

    }
}

class ForS140 {
    void for1() {
        int a, b;
        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a  =" + a);
            System.out.println("b  =" + b);
        }
    }

    void forVar() {

        int i;
        boolean done = false;
        i = 0;
        for (; !done; ) {
            System.out.println("i  равно " + i);
            if (i == 10) done = true;
            i++;
        }
    }

    void forEch1() {
        /**
         for ( тип итерационная переменная : коллекция массива) блок операторов
         */
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 9; i >= 0; i = i - 1) sum += nums[i];//sum = sum + nums[i]
        System.out.println(sum);
    }

    void forEch2() {

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x : nums)
            sum += x; //            sum = sum + x;
        System.out.println(sum);
    }

    void forEch3() {

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x : nums) {
            System.out.print("Znach = " + x);
            sum = sum + x;
            System.out.println(" , summa znach ravno :" + sum);
            if (x == 5) break;
        }

        System.out.println(sum);
    }

    void serchFor() {

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int val = 5;
        boolean found = false;
        //  использовать цикл for в  стиле for each для
        //  поиска значения переменной val в  массиве nums
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Значение 5 найдено");
    }

    }

class VlogCikl {
    void nested() {
        int i, j;
        for (i = 0; i < 10; i++) {
            for (j = i; j < 10; j++)
                System.out.print("+");
            System.out.println();
        }
    }


        void nested2() {
            System.out.println();
            int i, j;

                for (j = 0; j < 20; j++)
                    System.out.print(".");
                System.out.println();

        }
    }
