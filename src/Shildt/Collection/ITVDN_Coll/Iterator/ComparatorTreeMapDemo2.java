package Shildt.Collection.ITVDN_Coll.Iterator;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Tcomp implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
//        найти индекс  символа,  с которого начинается фамилия
        int i, j, k;
        i = a.lastIndexOf(' ');
        j = b.lastIndexOf(' ');
        k = a.substring(i).compareTo(b.substring(j));
        if (k == 0) // амилии совпадают,  проверить имя и  фамилию полностью
            return a.compareTo(b);
        else return k;

    }
}

public class ComparatorTreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>(new Tcomp());
        tm.put("Джoн Доу", 3434.34);
        tm.put("Toм  Смит", 123.22);
        tm.put("Джейн Бейкер", 1378.0);
        tm.put("Toд  Халл", 99.22);
        tm.put("Paльф Смит", -19.08);
//        получить множество элементов
        Set<Map.Entry<String,Double>> set = tm.entrySet();
//        вывести элементы из  множества
        for(Map.Entry<String,Double> me: set){
            System.out.println(me.getKey()+": ");
            System.out.println(me.getValue());
            System.out.println();

//            внести  сумму 1000 на  счет Джона Доу
            double balance = tm.get( "Джoн Доу");
            tm.put("Джoн Доу",  balance + 1000);
            System.out.println("Hoвый  остаток на  счете Джона Доу : "+ tm. get ( "Джoн Доу"));
        }
    }
}
