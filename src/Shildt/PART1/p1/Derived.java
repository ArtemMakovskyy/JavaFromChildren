package Shildt.PART1.p1;

class Derived extends  Protection{
    Derived(){
        System.out.println("кoнcтpyктop  подкласса");
        System.out.println("n  =" +  n);

        // доступно только для класса
        // System.out.println("n_pri "4 +  n_pri);

        System.out.println("n  pri "+ n_pro);
        System.out.println("n  pri "+ n_pub);
    }
}
