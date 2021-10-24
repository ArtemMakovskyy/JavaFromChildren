package Shildt.Paralelizm;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class CalculateEx implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "- " + Thread.currentThread().getName() + " " + Thread.currentThread().getName());
        }
        return null;
    }
}

class CalculateEx2 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        try {
            System.out.println("Started" + Thread.currentThread().getId());
            long l = (long) (1000 * Math.random());
            Thread.sleep(l);
            System.out.println(l + " Finished" + Thread.currentThread().getId() + " " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
        return 99;
    }
}

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Callable<Integer>callable = new CalculateEx();
//        FutureTask<Integer> futureTask = new FutureTask<>(callable);
//        new Thread(futureTask).run();
//        futureTask.get();

        ExecutorService es = Executors.newFixedThreadPool(3);
        List<Future<Integer>> tasks = new ArrayList<>();
        CalculateEx c1 = new CalculateEx();
        CalculateEx2 c2 = new CalculateEx2();
        Future<Integer> sub = es.submit(c1);
        Future<Integer> sub2 = es.submit(c2);
        tasks.add(sub);
        tasks.add(sub2);

        for (Future<Integer> i: tasks){
            System.err.println(i.get());
        }
            es.shutdown();


    }
}
