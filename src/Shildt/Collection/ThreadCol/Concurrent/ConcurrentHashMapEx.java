package Shildt.Collection.ThreadCol.Concurrent;

import java.util.HashMap;
import java.util.Iterator;

public class ConcurrentHashMapEx {
    public static void main(String[] args) throws InterruptedException {
        HashMap<Integer, String> map = new HashMap<>();
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
                        Thread.sleep(100);

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
                        Thread.sleep(300);

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
