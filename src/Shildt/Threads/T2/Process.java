package Shildt.Threads.T2;

public class Process {
    String str;
   synchronized void startIt(String str){
        try {
            System.out.print("["+str);
            Thread.sleep(150);
        } catch (InterruptedException e) {
            System.out.println("Prervano");
        }
        System.out.println("]");
    }
}
