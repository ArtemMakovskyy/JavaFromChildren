package Shildt.Collection.ThreadCol.Concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExCopy {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Zaur");
        map.put(2, "Oleg");
        map.put(3, "Serg");
        map.put(4, "Ivan");
        map.put(5, "Igor");
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                Iterator<Integer> iterator = map.keySet().iterator();
                /**  у мап нет итератора, по єтому візівают кей */
                while (iterator.hasNext()) {
                    try {
                        Thread.sleep(10);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Integer i = iterator.next();
                    System.out.println(i + ":" + map.get(i));
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                Iterator<Integer> iterator = map.keySet().iterator();
                /**  у мап нет итератора, по єтому візівают кей */
                while (iterator.hasNext()) {
                    try {
                        Thread.sleep(30);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    map.put(6, "Elena");
                }
            }
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2= new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);


    }
}
