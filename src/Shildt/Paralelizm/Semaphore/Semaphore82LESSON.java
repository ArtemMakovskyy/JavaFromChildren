package Shildt.Paralelizm.Semaphore;

import java.util.concurrent.Semaphore;

//https://www.youtube.com/watch?v=lHytuX5jbR8
public class Semaphore82LESSON {
    public static void main(String[] args) {
        Semaphore tableOn1 = new Semaphore(2, true);
        Semaphore tableOn3 = new Semaphore(3, true);
        Semaphore s = tableOn3;



        PersonS personS1 = new PersonS("a",s);
        PersonS personS2 = new PersonS("b",s);
        PersonS personS3 = new PersonS("c",s);
        PersonS personS4 = new PersonS("a",s);
        PersonS personS5 = new PersonS("f",s);

//        personS1.table = s;
//        personS2.table = s;
//        personS3.table = s;
//        personS4.table = s;
//        personS5.table = s;

    }
}

class PersonS extends Thread {
    Semaphore table;
    String name;

    public PersonS(String name,Semaphore table) {
        this.table = table;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " weiting " + name);
        try {
            table.acquire();
            System.out.println(this.getName() + " eat " + name);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName() + " reliease " + name);
        table.release();
    }
}