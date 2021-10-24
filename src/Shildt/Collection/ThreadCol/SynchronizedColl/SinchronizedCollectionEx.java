package Shildt.Collection.ThreadCol.SynchronizedColl;
//https://www.youtube.com/watch?v=nifOyLM4TrI&list=PLqj7-hRTFl_oDMBjI_EstsFcDAwt-Arhs&index=26

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SinchronizedCollectionEx {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            source.add(i);
        }
        ArrayList<Integer> target = new ArrayList<>();
//                Runnable runnable = () -> {
//            target.addAll(source);
//        };
        Runnable runnable = new Runnable(){
            public void run(){
                target.addAll(source);
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(target);

    }
}
