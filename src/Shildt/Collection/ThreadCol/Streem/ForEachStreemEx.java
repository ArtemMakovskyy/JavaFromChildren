package Shildt.Collection.ThreadCol.Streem;

import java.util.Arrays;
class Utils{
    public static void myMeth(int a){
        a = a+5;
        System.out.println("el = "+a);
    }

}
public class ForEachStreemEx {
    public static void main(String[] args) {
        int[] arrey = {5, 9, 3, 8, 1};
        Arrays.stream(arrey).forEach(el -> {
            el *= 2;
            System.out.print(el+", ");
        });
        System.out.println();
        Arrays.stream(arrey).forEach(el-> System.out.print(el+",  "));
        Arrays.stream(arrey).forEach(System.out::print);
        System.out.println();
        Arrays.stream(arrey).forEach(Utils::myMeth);
        System.out.println();
        Arrays.stream(arrey).forEach(el -> Utils.myMeth(el));

    }
}
