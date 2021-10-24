package BB;

public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        Produser p = new Produser(q);
        Consumer c = new Consumer(q);
    }
}
