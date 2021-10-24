package Shildt.Collection.ThreadCol.TreadEx;
class MyRun implements Runnable {
    Thread t;
    public MyRun() {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {

        try {
            for (int i = 1; i <= 10; i++){
                System.err.println(i);


                Thread.sleep(250);}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" ");
    }
}

public class Ex8 extends Thread {

    public Ex8() {
        new Thread(this).start();
    }
    @Override
    public void run() {

        try {
            for (int i = 1; i <= 10; i++){

                System.out.println(i);


            Thread.sleep(250);}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ");
    }

    public static void main(String[] args) throws InterruptedException {
        Ex8 ex8 = new Ex8();
        MyRun myRun = new MyRun();
        ex8.join();
        myRun.t.join();
        System.out.println("Конец");
    }
}


