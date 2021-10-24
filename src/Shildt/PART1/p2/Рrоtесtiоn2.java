package Shildt.PART1.p2;

import Shildt.PART1.p1.Protection;

 class Рrоtесtiоn2 extends Protection {
    void Protection2(){
        System.out.println("конструктор , унаследованный иэ другого пакета");
        // доступно только для данного класса или пакета
        // System.out.println("n =" +  n);

        // доступно только для данного класса
        // System.out.println("n_pri =" +  n_pri);

        System.out.println("n_pro =" +  n_pro);
        System.out.println("n_pub =" +  n_pub);
    }
}
