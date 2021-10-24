package Shildt.Collection.ThreadCol.SynchronizedColl;
//https://www.youtube.com/watch?v=nifOyLM4TrI&list=PLqj7-hRTFl_oDMBjI_EstsFcDAwt-Arhs&index=26
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SinchronizedCollectionEx2Copy {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        List<Integer> syncList = Collections.synchronizedList(arrayList);

        Runnable runnable1 = () -> {
            synchronized (syncList) {
                Iterator<Integer> iterator = syncList.iterator();
                while (iterator.hasNext()) {
                    System.out.print(iterator.next() + ",");
                }
            }
        };
        System.out.println();

        Runnable runnable2 = () -> syncList.remove(10);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.run();
        thread2.run();
        thread1.join();
        thread2.join();
        System.out.println();
        System.out.println(arrayList);


    }
}
