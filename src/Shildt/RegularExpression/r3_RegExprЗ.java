package Shildt.RegularExpression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class r3_RegExprЗ {
    public static void main(String[] args) {

        Pattern pat = Pattern.compile("test");

        Matcher mat = pat.matcher("test 1 2 3 test");
        while (mat.find()) {
            System.out.println("Подпоследовательность test " +
                    "найдена по индексу " + mat.start());
        }


        //my test
        List<Integer> list = new ArrayList<>();
        Pattern pat1 = Pattern.compile("1");
        Matcher mat1 = pat1.matcher("s1 ds s  s1d s ds1 ds 1 sd 1sd  1 sd1 1 11");

        while (mat1.find()){
//            System.out.println(mat1.start());
            list.add(mat1.start());
        }
        System.out.println(list);
        Integer reduce = list.stream().reduce(0, (a, b) -> (a + b));
        System.out.println(reduce);
        Stream<Integer>str = list.parallelStream();
        Stream<Integer>str2 = list.stream();


        Optional opt = str.max((x1,x2)->(x1-x2));
        Optional opt2 = str2.min((x1,x2)->(x1-x2));
        System.out.println(opt.get()+" "+opt2.get());

    }
}
