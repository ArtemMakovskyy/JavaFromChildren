package Shildt.Paralelizm.ForkJoin.WorkOnJava;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Work89 {
    static long op = 100_000L;
    static int core = Runtime.getRuntime().availableProcessors();
    public static void main(String[] args) {

        ForkJoinPool pool = new ForkJoinPool();
        MyFork2 task = new MyFork2(0,op);

        long start = System.nanoTime();
        System.out.println(pool.invoke(task));
        long finish = System.nanoTime();
        System.out.println((finish-start)/100000);

    }
}
class MyFork2 extends RecursiveTask<Long>{
long from, to;

    public MyFork2(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    protected Long compute() {
        if ((to - from) < 1000) {
            long j = 0;
            for (long i = from; i < to; i++) {
                j += i;
            }
            return j;
        }else {
            long middl = (to + from) / 2;
            MyFork2 firstHalf = new MyFork2(from, middl);
            firstHalf.fork();
            MyFork2 secondHalf = new MyFork2(middl+1, to);
            long secondValue = secondHalf.compute();
            return firstHalf.join() + secondValue;
        }
    }
}