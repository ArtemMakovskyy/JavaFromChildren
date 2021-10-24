package Shildt.PART1.S280;

public class CurrentThreadDemo {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();

        System.out.println("Teкyщий поток исполнения :   " + t);

        // изменить имя потока исполнения
        t.setName("My Thread");
        System.out.println("Пocлe изменения имени потока:   " + t);


        try {
            for (int n = 5; n > 0; n--) {
                System.err.println(n+" "+t.getName());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток исполнения прерван");
        }
        System.out.println(t.getName());
    }
}


