package Shildt.PART2.LyambdaS454;
@FunctionalInterface
interface DateAr<T>{
  int da ( T [] ar , T v);
}

class FindDate<T> {
    static <T> int findArrFunc(T[] ar, T v) {
        int count = 0;
        for (int i = 0; i < ar.length; i++)
            if (ar[i] == v) count++;
        return count;
    }
}

public class CountArray {
static <T> int unAr(DateAr<T> d, T [] ar , T v){
    return d.da(ar, v);
}
    public static void main(String[] args) {
        Integer[] intArr = {1, 1, 1, 1, 2,};
        int c = 0;
        c = FindDate.findArrFunc(intArr, 1);
        System.out.println(c);
        c = unAr(FindDate::findArrFunc,intArr,1);
        System.out.println(c);

        String [] strAr  ={"one","one","one","two","three"};
        c = unAr(FindDate::<String>findArrFunc,strAr,"one");

        System.out.println(c);

    }
}
