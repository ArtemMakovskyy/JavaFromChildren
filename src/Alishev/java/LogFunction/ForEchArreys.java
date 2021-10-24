package Alishev.java.LogFunction;

public class ForEchArreys {
    public static void main(String[] args) {
        ForFuncs ff = new ForFuncs();
        ff.for1();
        System.out.println();
        ff.forEchString();
        System.out.println(        );
        ff.forEchInt();
    }
}

class ForFuncs{
    void for1(){
        String[] stringArs = new String[3];
        stringArs[0] ="hi";
        stringArs[1] ="godby";
        stringArs[2] ="by";

        for(int i=0; i< stringArs.length;i++)
            System.out.println(stringArs[i]);
    }
    void forEchString(){
        String[] stringArs = new String[3];
        stringArs[0] ="hi 1";
        stringArs[1] ="godby 2";
        stringArs[2] ="by 3";

        for(String sa:stringArs)
            System.out.println(sa);
}

void forEchInt() {  //сумма чисел
    int mas[] = {1, 2, 3};
    int sum = 0;
    for (int x : mas) {
        System.out.print(x + " ");
        sum = sum + x;
    }
    System.out.println(" Итого сумма чисел: "+sum);
}
}