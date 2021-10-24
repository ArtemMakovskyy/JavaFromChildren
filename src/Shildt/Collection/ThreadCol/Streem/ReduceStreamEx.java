package Shildt.Collection.ThreadCol.Streem;
//https://www.youtube.com/watch?v=C6yYDfDqSJg&list=PLqj7-hRTFl_oDMBjI_EstsFcDAwt-Arhs&index=32
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceStreamEx {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int resoult = list.stream().reduce((accumulator, elemrnt) -> accumulator*elemrnt).get();
        System.out.println(resoult);   // =960

        int resoult2 = list.stream().reduce(1,(accumulator, elemrnt) -> accumulator*elemrnt);
        System.out.println(resoult2);   // =960

        List<Integer> list100= new ArrayList<>();
        Optional<Integer> o = list100.stream().reduce((accumulator, elemrnt) -> accumulator*elemrnt);
        if(o.isPresent()){
            System.out.println(o.get());
        }else System.out.println("not present");


        Optional<Integer> o2 = list.stream().reduce((accumulator, elemrnt) -> accumulator*elemrnt);
        if(o2.isPresent()){
            System.out.println(o2.get());
        }else System.out.println("not present");
    }


}
