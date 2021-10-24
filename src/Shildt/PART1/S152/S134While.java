package Shildt.PART1.S152;

public class S134While {
    public static void main(String[] args) {
        WhileF wf = new WhileF();
//        wf.tento0();
//        wf.uravnenie();
        wf.nowbody();
        wf.nowbody2();
    }
}


class WhileF{

    void tento0(){
        int n = 10;
        while (n > 0) {
            System.out.println(n);
            n--;
        }
    }

    void uravnenie() {
        int a = 10;
        int b = 20;
        while (a < b) {
            System.out.println("a<b");
            break;
        }
        System.out.println("a>b");
    }

    void nowbody(){
        int i = 100;
        int j = 200;
        while (++i < --j);
        System.out.println(i);
        System.out.println(j);
    }
    void nowbody2(){
        int i = 100;
        int j = 100;
++i;
        System.out.println(i);
i++;
        System.out.println(j);
    }

}