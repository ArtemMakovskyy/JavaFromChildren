package Shildt.Paralelizm.ForkJoin.WorkOnJava;
//Урок по Java 89: Многопоточность 24: ForkJoinFramework
//https://www.youtube.com/watch?v=Ft8D_Toqa0k
import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class MyFork extends RecursiveTask<Long> {
    long from, to;

    public MyFork(long from, long to) {
        this.from = from;
        this.to = to;
    }

    TestW83 testW83 = new TestW83();

    @Override
    protected Long compute() {
        //если опреация разбита на достаточное кол частей ->
        // выполняем операцию , иначе разбиваемна части пеньше
        if (to - from <= testW83.op / testW83.numCore) {
            long j = 0;
            for (long i = from; i < to; i++) {
                j += i;
            }
            return j;
        } else {
            long middl = (to + from) / 2;
            MyFork firstHalf = new MyFork(from, middl);
            firstHalf.fork();
            MyFork secondHalf = new MyFork(middl + 1, to);
            long secondValue = secondHalf.compute();
            return firstHalf.join() + secondValue;
        }
    }
}

class TestW83 {
    static long op = 25_000_000_000L;
    static int numCore = Runtime.getRuntime().availableProcessors();

    void countOneThread() {
        long sT = System.nanoTime();
//        System.out.println("============\n"+sT/1000000);

        long j = 0;
        for (long i = 0; i < op; i++) {
            j += i;
        }
        System.out.println(j);
        long fT = System.nanoTime();
//        System.out.println(fT/1000000);
        System.out.println((fT-sT)/10000000);
    }

    void countFJP() {
//        System.out.println(new Date());

        long sT = System.nanoTime();
//        System.out.println("============\n"+sT/1000000);
        ForkJoinPool pool = new ForkJoinPool();
//        ForkJoinPool pool = new ForkJoinPool(numCore);
        System.out.println(pool.invoke(new MyFork(0, op)));
//        System.out.println(new Date());
        long fT = System.nanoTime();
//        System.out.println(fT/1000000);
        System.out.println((fT-sT)/10000000);
    }
}

public class W83MultiThread {
    public static void main(String[] args) {
        TestW83 t1 = new TestW83();

        t1.countOneThread();
        System.out.println();
        t1.countFJP();
    }
}







