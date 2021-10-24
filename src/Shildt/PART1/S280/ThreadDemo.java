package Shildt.PART1.S280;

class NewThread implements Runnable {
    Thread t;

    NewThread() {
        //11 создать новый,   второй поток исполнения
        t = new Thread(this, "6 Демонстрационный поток");
        System.out.println(7+" Дoчepний поток создан:   " + t);
        t.start();   //запустить поток исполнения
    }
    // Точка входа во второй поток исполнения
    @Override
    public void run() {
        try {
            for(int i = 5; i>0; i--){
                System.out.println(8+ " Дoчepний поток:   "+ i);
                Thread.sleep(125);
            }
        } catch (InterruptedException e) {
            System.out . println( "Дoчepний поток прерван.");
        }
        System.out. println(9+ " Дoчepний поток завершен.");
    }
}


public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();  //оздать новый поток
        try {
            for(int i = 5; i>0; i--){
                Thread.sleep(250);
            }
        } catch (InterruptedException e) {
            System.out . println(0+ "Глaвный поток прерван.");
        }
        System. out.println(10+ " Глaвный поток завершен.");
    }
}
