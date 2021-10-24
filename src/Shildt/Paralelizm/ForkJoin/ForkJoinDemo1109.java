package Shildt.Paralelizm.ForkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinDemo1109 {
    public static void main(String[] args) {
        ForkJoinPool Pool = new ForkJoinPool();
        int lengthArr = 100_000;
        double[] nums = new double[lengthArr];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }
        System.out.println("Часть исходной последовательности:");
        for (int i = 0; i < 5; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        SqrtTransformRA task = new SqrtTransformRA(nums, 0, nums.length);

        int beginT = (int) System.nanoTime() / 10000;
        Pool.invoke(task);
        int finishT = (int) System.nanoTime() / 10000;

        System.out.println("Чacть преобразованной • последовательности " +
                "(с точностью до четырех знаков после десятичной точки):");

        for (int i = 0; i < 2; i++) {
            System.out.format("%.4f ", nums[i]);
            System.out.println();
        }
        System.out.println(beginT + " start");
        for (int i = (100_000_000 - 1000); i < 100; i++) {
            System.out.println(task.data[i] + "task");
        }
        System.out.println(finishT + " finish, dif = " + (finishT - beginT));

    }
}

class SqrtTransformRA extends RecursiveAction {
    final int seqThreshold = 1000;
    double[] data;
    int start, end;

    public SqrtTransformRA(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
//        Этот метод выполняет параллельное вычисление
//        Если количество элементов меньше порогового
//        значения, выполнить дальнейшую обработку последовательно
        if ((end - start) < seqThreshold) {
            for (int i = start; i < end; i++) {
                data[i] = Math.sqrt(data[i]);
            }
        } else {
            int middle = (start + end) / 2;
            invokeAll(
                    new SqrtTransformRA(data, start, middle),
                    new SqrtTransformRA(data, middle, end));
        }
    }
}