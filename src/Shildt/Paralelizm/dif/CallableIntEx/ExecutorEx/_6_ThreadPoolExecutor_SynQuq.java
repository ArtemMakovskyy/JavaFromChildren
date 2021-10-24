package Shildt.Paralelizm.dif.CallableIntEx.ExecutorEx;
//https://www.youtube.com/watch?v=GtHe_wzJsWo
//ThreadPoolExecutor
//https://www.youtube.com/watch?v=nU3Yf8UVWVc

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class MyCallable2 implements Callable<Long> {

    @Override
    public Long call() throws Exception {
        try {
            System.out.println("Started:" + Thread.currentThread().getId());
            Thread.sleep((long) (2000 + (Math.random() * 5000)));
            System.out.println("Finished:" + Thread.currentThread().getId());
            return Thread.currentThread().getId();
        } catch (Exception e) {

        }

        return null;
    }
}

class MyCallable implements Callable<Long> {

    @Override
    public Long call() throws Exception {
        try {
            System.out.println("Started:" + Thread.currentThread().getId());
            Thread.sleep((long) (1000 + (Math.random() * 5000)));
            System.out.println("Finished:" + Thread.currentThread().getId());
            return Thread.currentThread().getId();
        } catch (Exception e) {
            System.out.println(1111111);
        }
        return Thread.currentThread().getId();
    }
}

class MyReject implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("REJECTED");
    }
}

class StartedExecutirServiceEx2void {
    void _1_ExecutirService() throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(10);

        List<Future<Long>> tasks = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
//            es.execute((Runnable) new MyCallable()); // не відает информацию
            MyCallable mc = new MyCallable();
            Future<Long> submit = es.submit(mc);
            tasks.add(submit);
        }

        for (Future<Long> f : tasks) {
            f.get();
        }
        System.out.println("END");
        es.shutdown();
    }

    void _2_ExecutirService() throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(10);

        List<MyCallable> tasks = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            MyCallable mc = new MyCallable();
            tasks.add(mc);
        }

        List<Future<Long>> futures = es.invokeAll(tasks);

        for (Future<Long> f : futures) {
            System.out.println(f.get());
        }

        System.out.println("END");
        es.shutdown();
    }

    void _3_ExecutirService() throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(10);

        List<MyCallable> tasks = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            MyCallable mc = new MyCallable();
            tasks.add(mc);
        }

        Long aLong = es.invokeAny(tasks);

        System.out.println("END");
        es.shutdown();
    }

    void _4_ThreadPoolExecutor() {
        ThreadPoolExecutor es =
                new ThreadPoolExecutor(3, 6, 1,
                        TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(2));
        for (int i = 0; i < 7; i++) {
            MyCallable2 mc2 = new MyCallable2();
            es.submit(mc2);
        }
        es.shutdown();
    }

    void _5_ThreadPoolExecutor() {
        ThreadPoolExecutor es =
                new ThreadPoolExecutor(2, 4, 1,
                        TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(2), new MyReject());
        for (int i = 0; i < 7; i++) {
            MyCallable2 mc2 = new MyCallable2();
            es.submit(mc2);
        }
        es.shutdown();
    }

    void _6_ThreadPoolExecutor_SynQuq() {
        ThreadPoolExecutor es = new ThreadPoolExecutor(
                2, 4, 1, TimeUnit.MILLISECONDS, new SynchronousQueue<>(),
                new MyReject());
        for (int i = 0; i < 7; i++) {
            MyCallable2 mc2 = new MyCallable2();
            es.submit(mc2);
        }
        es.shutdown();
    }
}

public class _6_ThreadPoolExecutor_SynQuq {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        StartedExecutirServiceEx2void start = new StartedExecutirServiceEx2void();
//        start._1_ExecutirService();
//        start._2_ExecutirService();
//        start._3_ExecutirService();
//        start._4_ThreadPoolExecutor();
//        start._5_ThreadPoolExecutor();
        start._6_ThreadPoolExecutor_SynQuq();
    }
}