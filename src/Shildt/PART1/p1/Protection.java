package Shildt.PART1.p1;

public class Protection {
    int n = 1;
    private  int n_pri = 2;
    protected  int n_pro = 3;
    public int n_pub = 4;

    public Protection(){
        System.out.println("коеструктор базового класса");
        System.out.println("n  =" +  n);
        System.out.println("n  pri "+ n_pri);
        System.out.println("n  pri "+ n_pro);
        System.out.println("n  pri "+ n_pub);

    }
}
