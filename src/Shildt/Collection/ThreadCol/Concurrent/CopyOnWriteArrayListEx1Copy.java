package Shildt.Collection.ThreadCol.Concurrent;
//https://www.youtube.com/watch?v=QiO_-GXLP-8&list=PLqj7-hRTFl_oDMBjI_EstsFcDAwt-Arhs&index=38
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArrayListEx1Copy {
    public static void main(String[] args) throws InterruptedException {

        @Info(s = "Создает копию всего массива во время изменения" +
                "используется при редких изменениях, но частых чтениях")
        CopyOnWriteArraySet<String> listSet = new CopyOnWriteArraySet<>();

        @Info(s = "Создает копию всего массива во время изменения" +
                "используется при редких изменениях, но частых чтениях")
        CopyOnWriteArrayList<String> listAL = new CopyOnWriteArrayList<>();
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
                while (it.hasNext()) {
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
        System.out.println(listAL);
    }
}
