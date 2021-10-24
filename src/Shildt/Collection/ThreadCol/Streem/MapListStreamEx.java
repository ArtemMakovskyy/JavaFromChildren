package Shildt.Collection.ThreadCol.Streem;
//https://www.youtube.com/watch?v=oTdm_CVIdJM&list=PLqj7-hRTFl_oDMBjI_EstsFcDAwt-Arhs&index=29
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapListStreamEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kaka dela");
        list.add("ok");
        list.add("poka");
//        for (int i = 0; i < list.size(); i++) {
////            list.set(i, list.get(i).length()); преобразовали ин в стринг
//            list.set(i, String.valueOf( list.get(i).length()));
//        }
        List<Integer> list2 = list.stream().map(element -> element.length())
                .collect(Collectors.toList());
        System.out.println(list2);

        int[] array = {5,9,3,8,1};
        System.out.println(Arrays.toString(array)+" %3");
        Arrays.stream(array); // преобразовали массив в стрим
        array = Arrays.stream(array).map(element ->{
            if(element % 3 == 0){
                element = element/3;
            }
            return element;
        }).toArray();

        System.out.println(Arrays.toString(array));


        for (int i: array)
        System.out.print(i + ", ");

    }
}
