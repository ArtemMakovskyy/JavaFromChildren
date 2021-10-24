package Shildt.Paralelizm.ForkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class Transform extends RecursiveAction {
    int seqThreshold;
    double[] data;
    int start, end;

    public Transform(int seqThreshold, double[] data, int start, int end) {
        this.seqThreshold = seqThreshold;
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if ((end - start) < seqThreshold) {
            for (int i = start; i < end; i++) {
                if ((data[i] % 2) == 0) data[i] = Math.sqrt(data[i]);
                else data[i] = Math.cbrt(data[i]);
            }
        } else {
            int middle = (end + start) / 2;
            invokeAll(
                    new Transform(seqThreshold, data, start, middle),
                    new Transform(seqThreshold, data, middle, end)
            );
        }
    }

    boolean show(){
        for (int i = 0; i < 10; i++) {
            System.out.println(data[i]);
        }
        return false;
    }
}

public class FJExperiment1111 {
    public static void main(String[] args) {
        int pLevel, threshold;

//        if (args.length != 2) {
//            System.out.println("Иcпoльзoвaниe: FJExperiment параллелизм порог");
//            return;
//        }
//        pLevel = Integer.parseInt(args[0]);
//        threshold = Integer.parseInt(args[1]);
        pLevel = 12;
        threshold = 1000;

        long beginT, endT;
        ForkJoinPool fjp = new ForkJoinPool(pLevel);
        double[] nums = new double[1_000_000_00];
        for (int i = 0; i < nums.length; i++) nums[i] = (double) i;

        Transform task = new Transform(threshold, nums, 0, nums.length);

        beginT = System.nanoTime();
        fjp.invoke(task);
        endT = System.nanoTime();

        System.out.println("Ypoвeнь параллелизма: " + pLevel);
        System.out.println("Пopoг последовательной обработки: " + threshold);
        System.out.println("Истекшее время: " + ((endT - beginT)/100000) + " с");
        System.out.println();

    }
}
