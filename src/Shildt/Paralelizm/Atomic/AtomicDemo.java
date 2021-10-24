package Shildt.Paralelizm.Atomic;
//1100p
import java.util.concurrent.atomic.AtomicInteger;

class Shared2 {
    static AtomicInteger ai = new AtomicInteger(0);
}

class AtomThread implements Runnable {
    String name;

    public AtomThread(String name) {
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + name);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Пoтoк " + name + " получено: " + Shared2.ai.getAndSet(i));
        }
    }
}


public class AtomicDemo {
    public static void main(String[] args) {
        new AtomThread("A");
        new AtomThread("B");
        new AtomThread("C");
    }
}
