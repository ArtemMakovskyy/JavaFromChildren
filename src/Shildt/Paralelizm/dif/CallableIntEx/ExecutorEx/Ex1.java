package Shildt.Paralelizm.dif.CallableIntEx.ExecutorEx;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex1 {
    public static void main(String[] args) {
        /** ExecutorService executorService - для упорядочивания, контроля большого ко-ва потоков
         * позволяют деолать пул потоков, в котором есть очередь.
         * Executors.newSingleThreadExecutor() - создает одну очередь = newFixedThreadPool(1);
         * Executors.newCachedThreadPool() - не фиксированный
         * для выполнения запускаем ExecutorService es = Executors.newFixedThreadPool(5); -> es.execute(new MyRunneble())
         * 2var es.submit(new MyRunneble())
         *
         * Future<?> sub = es.submit(new MyRunneble())// как квитанция с новыми методами
         *
         * FutureTask -
         */
        ExecutorService executorService = Executors.newFixedThreadPool(2);



    }
    static class MyRanneble implements Callable<String>{

        @Override
        public String call() throws Exception {
            return null;
        }
    }
}
