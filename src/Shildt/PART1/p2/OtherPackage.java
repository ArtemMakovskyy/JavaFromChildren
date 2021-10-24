package Shildt.PART1.p2;

import Shildt.PART1.p1.Protection;

class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println("кoнcтpyктop иэ другого пакета");

        // доступно только для данного класса или пакета
        // System.out.println("n =" +  p.n);

        // доступно только для данного класса
        // System.out.println("n_pri =" +  p.n_pri);

        // доступно только для данного класса, подкласса или пакета
        // System.out.println("n_pro =" +  p.n_pro);

        System.out.println("n_pub =" +  p.n_pub);

    }
}
