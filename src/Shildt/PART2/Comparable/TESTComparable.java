package Shildt.PART2.Comparable;

import java.util.ArrayList;
import java.util.Collections;

class OneD{
    int x;

    public OneD(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class CalcMax{
    static int compareMC(OneD a, OneD b){
        return a.getX() - b.getX();
    }
}

public class TESTComparable {
    public static void main(String[] args) {
        ArrayList<OneD>al = new ArrayList<>();
        al.add(new OneD(18));
        al.add(new OneD(11));
        al.add(new OneD(21));
        al.add(new OneD(12));

        OneD dMax = Collections.max(al,CalcMax::compareMC);
        System.out.println(dMax.getX());

        OneD dMin = Collections.min(al,CalcMax::compareMC);
        System.out.println(dMin.getX());
/**  ////////////////////////////   */

    }
}
