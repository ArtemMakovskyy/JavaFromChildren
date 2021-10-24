package Shildt.PART1.S152;

public class s122PeremennieLog {
    public static void main(String[] args) {
        Rashcoti ra = new Rashcoti();
        System.out.println(ra.vopros());
        System.out.println(ra.ne());
        System.out.println(ra.test());
    }
}

class Rashcoti {

    int vopros() {
        int i, k;
        i = 10;
        k = i < 0 ? -10 : i; // если к true ? если да : если нет;
        return k;
    }

    int ne() {
        int i, k;
        i = -10;
        k = i < 0 ? -10 : i; // если к true ? если да : если нет;
        return k;
    }

    int test() {
        int c, e, d, s;
        c = 1;
        e = 5;
        s = 25;
        if (c == 1 | e < 100) d = 100;
 //       else {
//           s = s;
  //      }
        return s;

    }
}