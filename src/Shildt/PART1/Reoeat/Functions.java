package Shildt.PART1.Reoeat;

public class Functions {
    public static void main(String[] args) {
        IfSample is = new IfSample();
        int s = 8;
        switch (s) {
            case 1:
                is.ifSample(1);
                return;
            case 2:
                is.forSample();
                return;
            case 3:
                is.date();
                return;
            case 4:
                is.array2d();
                return;
            case 5:
                is.array2d2();
                return;
            case 6:
                is.matrix();
                return;
            case 7:
               is.DoWhile();return;
            case 8:
                is.forEach();return;
        }
    }
}


class IfSample { // case4
    static void ifSample(int i) {      //case 1

        int x, y;
        x = i;

        x = 10;
        y = 20;

        if (x == 0) x = 0;

        if (x == 1) x = 1;
        if (x == 10) x = x + y;
        System.out.println(x);
    }//1

    static void forSample() {          //case2
        int x, y;
        for (x = 0; x < 10; x++)
            System.out.println("x= " + x);

    }//2

    static void date() {//case 3
        int i = 20;
        byte b;
        b = (byte) i;
        System.out.println(b);
    }//3

    static void array2d() {// case 4
        int twoD[][] = new int[4][5];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }//4

    static void array2d2() {// case 5 p.98
        int twoD[][] = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                twoD[i][j] = k;
                k++;
            }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }//5

    static void matrix(){ // case 6

        double m[][] = {{0*0,1*0,2*0,3*0},
                        {0*1,1*1,2*1,3*1},
                        {0*2,1*2,2*2,3*2},
                        {0*3,1*3,2*3,3*3}};
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }//6

    static void DoWhile(){//case 8 p.135
        int n = 10;
        do{
            System.out.println(" takt "+n);
         //   n--;
        }while(--n>0);
    }//7

    void forEach(){
        int nums [] = {1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int x : nums){
            System.out.println("znach  = "+x);
            sum+=x;
        }
        System.out.println("summa  = " + sum);
    }//8

}




