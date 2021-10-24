package Shildt.Paralelizm.ForkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class TestFJ {
    public static void main(String[] args) {
        int endLength = 10000;
        double data[] = new double[endLength];


        ForkJoinPool pool = new ForkJoinPool();
        StartMethod task = new StartMethod(data, 0, endLength);
        pool.invoke(task);
        task.show(task.data);

    }
}

class StartMethod extends RecursiveAction {
    double[] data;
    int start;
    int end;

    public StartMethod(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {

        if ((end - start) < 1000) {
            for (int i = 0; i < end; i++) {
                data[i] = i;
            }
        }else {
            int middle = (start + end) / 2;
            invokeAll(
                    new StartMethod(data, start, middle),
                    new StartMethod(data, middle, end));
        }
    }
    void show(double[]data){
        for (int i = 0; i < 5; i++) {
            System.out.println(data[i+800]+"!");
        }
        System.out.println(data[data.length-1]);
    }
}