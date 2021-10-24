package Shildt.Threads.T3;

public class StartPRN {
    public static void main(String[] args) {
        PRN1 prn1 = new PRN1();
        PRN2 prn2 = new PRN2();
        new Thread(prn1).start();
        new Thread(prn2).start();
    }
}
