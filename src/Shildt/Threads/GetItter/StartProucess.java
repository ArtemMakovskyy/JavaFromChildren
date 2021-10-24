package Shildt.Threads.GetItter;

public class StartProucess {
    public static void main(String[] args) {
        GetIterMethod q = new GetIterMethod();
        new Getter(q);
        new Puttter(q);
    }
}
