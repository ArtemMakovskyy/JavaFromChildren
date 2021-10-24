package Shildt.PART2.LyambdaS454;

@FunctionalInterface
interface MyFunc2<T> {
    boolean func(T v1, T v2);
}

class HighTemp2 {
    int hTemp;

    public HighTemp2(int ht) {
        this.hTemp = ht;
    }

    boolean semeTemp(HighTemp2 ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThenTemp(HighTemp2 ht2) {
        return hTemp < ht2.hTemp;
    }
}

public class InstanceMethWithObjectRefDemo2Short {

    static <T> int counter(T[] vals, MyFunc2<T> f, T val) {  //
        int count = 0;
        for (int i = 0; i < vals.length; i++) if (f.func(vals[i], val)) count++;
        return count;
    }

    public static void main(String[] args) {
        int count;
//        создать массив объектов типа HighTemp
        HighTemp[] weekDayHighs = {
                new HighTemp(89), new HighTemp(90),
                new HighTemp(89), new HighTemp(84),
                new HighTemp(82), new HighTemp(89),
                new HighTemp(91), new HighTemp(83),
        };
        count = counter(weekDayHighs, HighTemp::semeTemp, new HighTemp(89));
        System.out.println("Дней,   когда максимальная температура была 89: " + count);


    }
}
