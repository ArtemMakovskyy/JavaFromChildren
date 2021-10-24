package Shildt.PART1.S280;

// Создать несколько потоков  исполнения
class NewThread2 implements Runnable {
    String name; //  //имя потока исполнения
    Thread t;

    NewThread2(String treadName) {
        name = treadName;
        t = new Thread(this, name);
        System.out.println("Hoвый поток:   " + t);
        t.start();
    }

    @Override
    public void run() {
try{
    for (int i = 1; i < 6; i++) {
        System.out.println(name + ": "+ i);
        Thread.sleep(500);
    }
} catch (InterruptedException e) {
    e.printStackTrace();
}
        System.out.println(name +  "завершен.");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread2(" first ");
        new NewThread2(" second ");
        new NewThread2(" third ");


    }
}
