package Shildt.PART2.S437;


class StatS<T extends Number> {
    T[] nums;       //массив класса number

    StatS(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue();
        return sum / nums.length;
    }
    boolean sameAvg(StatS<?> ob){
        if (average()== ob.average())return true;
        return false;
    }

}

public class BoundsDemo2 {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        StatS<Integer> iOb = new StatS<>(inums);
        double v = iOb.average();
        System.out.println("Cpeднee  значение iob  равно "+ v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        StatS<Double> dOb = new StatS<>(dnums);
        double w = dOb.average();
        System.out.println("Cpeднee  значение dob  равно "+ w);


        Float fnums[] = {1.1F, 2.2F, 3.3F, 4.4F, 5.5F};
        StatS<Float> fOb = new StatS<>(fnums);
        double x = fOb.average();
        System.out.println("Cpeднee  значение fob  равно "+ x);

//        выяснить,   какие массивы имеют одинаковые средние значения

        if (dOb.sameAvg(fOb)) System.out.println("Cpeдниe значения одинаковы. ");
        else System.out.println( "Cpeдниe значения отличаются.");

        if (iOb.sameAvg(dOb)) System.out.println("Cpeдниe значения одинаковы. ");
        else System.out.println( "Cpeдниe значения отличаются.");
    }
}
