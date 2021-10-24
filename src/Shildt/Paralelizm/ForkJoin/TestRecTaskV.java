package Shildt.Paralelizm.ForkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class TestRecTaskV {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        double[] data = new double[5000];

        for (int i = 0; i < data.length; i++) {
            data[i] = (double) (((i % 2) == 0) ? i : -i);
        }

        Summator work = new Summator(0, data.length, data);

        double sum = pool.invoke(work);
        System.out.println(sum);

    }
}

class Summator extends RecursiveTask<Double> {
    final int seqThresHold = 100;
    int start;
    int end;
    double[] date;

    public Summator(int start, int end, double[] date) {
        this.start = start;
        this.end = end;
        this.date = date;
    }

    @Override
    protected Double compute() {
        double sum = 0;
        if ((end - start) < seqThresHold) {
            for (int i = start; i < end; i++) {
                sum += date[i];
            }
            return sum;
        }else {
            int middle = (end+start)>>>1;
//            int middle = (end+start)/2;
            Summator summatorA = new Summator(start,middle,date);
            Summator summatorB = new Summator(middle,end,date);
            summatorA.fork();
            summatorB.fork();
            sum = summatorA.join() + summatorB.join();
        }
        return sum;
    }
}