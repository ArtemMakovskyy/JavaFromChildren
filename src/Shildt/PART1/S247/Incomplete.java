package Shildt.PART1.S247;

abstract class Incomplete implements Callback{
    int a,b;

    void show(int c, int d){
        a=c;
        b=d;
        System.out.println(a+" "+b);
    }
}
