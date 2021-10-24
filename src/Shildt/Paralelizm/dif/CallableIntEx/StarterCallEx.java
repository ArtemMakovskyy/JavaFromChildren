package Shildt.Paralelizm.dif.CallableIntEx;

import java.util.concurrent.*;

/**
 * ForkJoinPool, ScheduledThreadPoolExecutor, ThreadPoolExecutor
 * https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ExecutorService.html
 * Executors NAW
 */


public class StarterCallEx {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //#1
//        ExecutorService es = Executors.newFixedThreadPool(5);
//        es.execute(new MyRunneble());//запуск простой
//        es.shutdown();

//        //#2
//        ExecutorService es = Executors.newFixedThreadPool(5);
//        Future<?> sub = es.submit(new MyRunneble());
//        //Future Квитанция - принято к исполнению
//        sub.isDone(); // проверка завершилось или нет
//        while (!sub.isDone()){
//            System.out.println("not done");
//            Thread.sleep(1000);
//        }
//
//        System.out.println("Shatdown");
//        es.shutdown();

        //#3
        ExecutorService es = Executors.newFixedThreadPool(5);
//        Future<?> sub = es.submit(new MyRunneble());
        Future<?> sub = es.submit(new MyCall());

        //get ожидает пока задача не исполнится
        // ранебле ничего не возвращеет
        // интерфейс колебл возвращает данные
//        sub.get();


//        Integer id = (Integer) sub.get();
//        System.out.println(id);


//        //тмена потока с иксепшином
//        Thread.sleep(1000);
//        sub.cancel(true);
//        System.out.println(sub.isCancelled());


        System.out.println("Shatdown");
        es.shutdown();
    }
}

class MyCall implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        try {
            System.out.println("Started" + Thread.currentThread().getId());
            Thread.sleep(5000);
            System.out.println("Finished" + Thread.currentThread().getId());
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
        return 99;
    }
}

class MyRunneble2 implements Runnable {
    @Override
    public void run() {

        try {
            System.out.println("Started" + Thread.currentThread().getId());
            Thread.sleep(5000);
            System.out.println("Finished" + Thread.currentThread().getId());
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }

    }
}