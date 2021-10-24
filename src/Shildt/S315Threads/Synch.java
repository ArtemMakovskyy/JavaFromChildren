package Shildt.S315Threads;

// Эта программа не синхронизирована
class Callme {
     void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.print("Пpepвaнo");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msgg;
    Callme targetCalme;
    Thread t;

    public Caller(Callme targ, String s) {
        targetCalme = targ;
        msgg = s;
        t = new Thread(this);
        t.start();
    }

    @Override
     public void run() {
        synchronized (targetCalme){
        targetCalme.call(msgg);}
    }
}

public class Synch {
    public static void main(String[] args) {
        Callme calme = new Callme();
        Caller ob1 = new Caller(calme, "Добро  пожаловать");

        Caller ob2 = new Caller(calme, "в синхронизированный");
        Caller ob3 = new Caller(calme, "мир!");

        // ожидать завершения потока исполнения
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Пpepвaнo");
        }
    }
}
