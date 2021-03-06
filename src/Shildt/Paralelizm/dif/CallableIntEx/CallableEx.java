package Shildt.Paralelizm.dif.CallableIntEx;
//https://www.youtube.com/watch?v=SWKvCA8eClg&t=197s
//Урок по Java 79: Многопоточность 14: Callable and Futures

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer>callable = new MyCallable();
        FutureTask futureTask = new FutureTask(callable);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());

    }
    static class MyCallable implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            int j = 0;
            for (int i = 0; i < 10; i++,j++) {
                Thread.sleep(200);
            }
            return j;
        }
    }
}
