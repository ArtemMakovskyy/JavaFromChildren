package Shildt.Collection.ThreadCol.Concurrent;
//https://www.youtube.com/watch?v=QiO_-GXLP-8&list=PLqj7-hRTFl_oDMBjI_EstsFcDAwt-Arhs&index=38
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.*;
import java.util.concurrent.*;
/** следующая очередь без иксепшина */
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
    String s();
}

public class CopyOnWriteArrayListEx1 {
    public static void main(String[] args) throws InterruptedException {

//        @Info(s = "Синхронизация тоько на запись")
//        List<String> list = new CopyOnWriteArrayList<>();
//
//        @Info(s = "Синхронизация тоько на запись")
//        Set<String> setList = new CopyOnWriteArraySet<>();
//        BlockingQueue<String> blockingQueue = new LinkedBlockingDeque<>();
//        BlockingQueue<String> blockingQueue2 = new ArrayBlockingQueue<String>(10);
//        BlockingQueue<String> blockingQueue3 = new PriorityBlockingQueue<>();
//        BlockingQueue<String> blockingQueue4 = new SynchronousQueue<>();
//        TransferQueue<String> transferQueue = new LinkedTransferQueue<>();
//        BlockingDeque<String> blockingDeque = new LinkedBlockingDeque<>();
//        ConcurrentMap<String, String> concurrentMap = new ConcurrentHashMap<>();

        ArrayList <String> listAL = new ArrayList<>();
        listAL.add("Zaur");
        listAL.add("Oleg");
        listAL.add("Serg");
        listAL.add("Ivan");
        listAL.add("Igor");
        System.out.println(listAL);

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                Iterator<String> it = listAL.iterator();
                while (it.hasNext()){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(it.next());
                }
            }
        };
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                listAL.remove(4);
                listAL.add("Elena");
            }
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
