package Shildt.PART2.LyambdaS454;

@FunctionalInterface
interface MyFunction<T> {
    int func(T[] vals, T v);
}

class MyArraysOps {
    static <T> int countMatching(T[] vals, T v) {  // p 458 ???
        int count = 0;
        for (int i = 0; i < vals.length; i++)
            if (vals[i] == v) count++;
        return count;
    }

    static int getMax(Integer[] vals){
        int max=vals[0];
        for (int i = 0; i < vals.length; i++)
            if (vals[i] >= max) max = vals[i];
        return max;
    }
    static int getMin(Integer[] vals){
        int min=vals[0];
        for (int i = 0; i < vals.length; i++)
            if (vals[i] <= min) min = vals[i];
        return min;
    }
}

public class GenericMethodRefDemo {
    //    В  качестве первого параме тра этого метода  указывается
    //    функциональный интерфейс МyFunc,   а  в качестве двух других
    //    параметров -массив и  значение,   причем оба типа Т
    static <T> int myOp(MyFunction<T> f, T[] vals, T v) {  //????? зачем рядом с инт и май функ
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {5, -2, 3, 4, 2, 3, 4, 22, 5};
        String[] strs = {"один", "два", "три", "два"};
        int count;

        count = MyArraysOps.countMatching(vals,3);
        System.out.println(count);

        count = myOp(MyArraysOps::<Integer>countMatching, vals, 4);
        System.out.println("Maccив vals содержит " + count + " числа /4/");

        count = myOp(MyArraysOps::<String>countMatching, strs, "два");
        System.out.println("Maccив strs   содержит " + count + " числа /два/");

        count = MyArraysOps.getMax(vals);
        int countMin = MyArraysOps.getMin(vals);

        System.out.println("Максимальное число "+count +" , минимальное число: " +countMin);

    }
}
