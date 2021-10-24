package Shildt.Paralelizm.dif.CallableIntEx.ExecutorEx;
//https://www.youtube.com/watch?v=DvkyCzEs5yQ

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;


class MyRunnebleExecutors1 implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("Start " + Thread.currentThread().getId());
            System.out.println("Start " + getClass().getSimpleName());
            Thread.sleep(1000);
            System.out.println("Finish " + Thread.currentThread().getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class StarterExecutorsEx1 {
    public static void main(String[] args) throws InterruptedException {

//        // Создается автоматический пул каналов
//       ExecutorService es =  Executors.newCachedThreadPool();
//        for (int i = 0; i < 30; i++) {
//            es.submit(new MyRunnebleExecutors1());
//        }


//        ExecutorService es =  Executors.newFixedThreadPool(10);
//        for (int i = 0; i < 20; i++) {
//            es.submit(new MyRunnebleExecutors1());
//        }


//        ExecutorService es =  Executors.newSingleThreadExecutor();
//        for (int i = 0; i < 20; i++) {
//            es.submit(new MyRunnebleExecutors1());
//        }

//        //Соответствует кол-ву ядер на компе
//        ExecutorService es =  Executors.newWorkStealingPool();
//        for (int i = 0; i < 24; i++) {
//            es.submit(new MyRunnebleExecutors1());
//        }
//        es.awaitTermination(2000, TimeUnit.MILLISECONDS);

        ExecutorService es =  Executors.newFixedThreadPool(10,new MyFactory());
        for (int i = 0; i < 11; i++) {
            es.submit(new MyRunnebleExecutors1());
        }
        es.shutdown();

    }
}
class  MyFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        return new SimpleTrread(r);
    }
}

class SimpleTrread extends Thread{
    public SimpleTrread(Runnable target) {
        super(target);
    }
}