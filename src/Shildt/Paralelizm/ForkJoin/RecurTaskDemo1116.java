package Shildt.Paralelizm.ForkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class RecurTaskDemo1116 {
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();
        double nums[] = new double[5000];

        for (int i = 0; i < nums.length; i++)
            nums[i] = (double) (((i % 2) == 0) ? i : -i);

        Sum task = new Sum(0, nums.length, nums);
        double sumator = fjp.invoke(task);
        System.out.println("Cyммиpoвaниe " + sumator);

    }
}

class Sum extends RecursiveTask<Double> {
    final int seqThresHold = 500;
    int start, end;
    double[] data;

    public Sum(int start, int end, double[] data) {
        this.start = start;
        this.end = end;
        this.data = data;
    }

    @Override
    protected Double compute() {
        double sum = 0;
        if ((end - start) < seqThresHold) {
            for (int i = start; i < end; i++) {
                sum += data[i];
            }
            return sum;
        } else {
            int middle = (start + end) / 2;
            //запустить новые подзадачи на выполнение, используя разделенные на части данные
            Sum subA = new Sum(start, middle, data);
            Sum subB = new Sum(middle, end, data);
//            запустить каждую подзадачу путем разветвления
            subA.fork();
            subB.fork();
//            ожидать завершения подзадач и накопить результаты
            sum = subA.join() + subB.join();
        }
        return sum;
    }
}