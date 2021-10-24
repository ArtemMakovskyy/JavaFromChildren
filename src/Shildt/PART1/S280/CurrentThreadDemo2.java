package Shildt.PART1.S280;

public class CurrentThreadDemo2 {
    public static void main(String[] args) {
        ThreadClon t2 = new ThreadClon();

        System.out.println("Teкyщий поток исполнения :   " + t2);

        // изменить имя потока исполнения
        t2.setName("My Thread");
        System.out.println("Пocлe изменения имени потока:   " + t2);
        System.out.println(t2.getName());
        t2.start();

    }

    static class ThreadClon extends Thread {
        public void run() {
            try {
                for (int n = 5; n > 0; n--) {
                    System.err.println(n);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Глaвный поток исполнения прерван");
            }
        }
    }
}