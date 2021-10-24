package LessonsJava;
//https://www.youtube.com/watch?v=bjh1HWV9RRk&list=PL786bPIlqEjRFPH8Z9IOwJWseG6Dq_Qxb

public class ThreadFirst {
    public static void main(String[] args)  {

        // создаем двумя способами
        // первій способ Thread 0

        MyThread myThread = new MyThread();
        myThread.start();


        // второй способ 2/2 hread 1
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();


    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}


// второй способ 1/2
class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}