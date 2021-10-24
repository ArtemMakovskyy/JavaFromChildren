package Shildt.Threads.GetItter.GS2;

public class StartClassTh {
    public static void main(String[] args) {
        GetSetMethods q = new GetSetMethods();
        new GetterIT(q);
        new PutterIT(q);
    }
}
