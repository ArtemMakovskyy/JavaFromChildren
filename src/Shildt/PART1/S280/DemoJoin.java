package Shildt.PART1.S280;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread3 ob1 = new NewThread3("First");
        NewThread3 ob2 = new NewThread3("Second");
        NewThread3 ob3 = new NewThread3("Therd");
        System.out.println("Пoтoк Один запущен :   " +  ob1.t.isAlive());
        System.out.println("Пoтoк Два запущен :   " +  ob2.t.isAlive());
        System.out.println("Пoтoк Три запущен :   " +  ob3.t.isAlive());
        // ожидать завершения потоков исполнения
        try {
            System.out.println("Oжидaниe завершения потоков.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out. println( "Глaвный поток прерван");
        }
        System.out.println("Пoтoк Один запущен :   " +  ob1.t.isAlive());
        System.out.println("Пoтoк Два запущен :   " +  ob2.t.isAlive());
        System.out.println("Пoтoк Три запущен :   " +  ob3.t.isAlive());

        System.out . println("Глaвный поток завершен.") ;
}
}

class NewThread3 implements Runnable {
    String name;
    Thread t;

    NewThread3(String threadname) {
        name = threadname;
        t = new Thread(this,name);
        System.out.println("Hoвый поток:   " + t);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name +  ": "+ i);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out. println( name +  " завершен.");
    }
}