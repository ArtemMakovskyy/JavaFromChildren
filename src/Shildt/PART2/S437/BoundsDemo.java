package Shildt.PART2.S437;


class StatsS<T extends Number> {
    T[] nums;       //массив класса number

    StatsS(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue();
        return sum / nums.length;
    }
}


public class BoundsDemo {
    public static void main(String[] args) {
        Integer inuS[] = {1, 2, 3, 4, 5};
        StatsS<Integer> iOb = new StatsS<>(inuS);
        double v = iOb.average();
        System.out.println("Cpeднee значение iob  равно " + v);


        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        StatsS<Double> dOb = new StatsS<>(dnums);
        double w = dOb.average();
        System.out.println("Cpeднee значение iob  равно " + w);
    }

}

