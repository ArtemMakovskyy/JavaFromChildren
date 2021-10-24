package Shildt.Collection.ITVDN_Coll.compareTo;
//p 622
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
class CompThisTest implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int ol1, ol2;
        ol1 = o1.lastIndexOf(' ');
        ol2 = o2.lastIndexOf(' ');
        return o1.substring(ol1).compareTo(o2.substring(ol2));
    }
}

class CompThisTest2 implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
public class Test_ThenComparing {
    public static void main(String[] args) {
        CompThisTest ctf = new CompThisTest();

        Comparator<String> compLastThen_First =
                ctf.thenComparing(new CompThisTest2());

        TreeMap<String, Integer> tm = new TreeMap<>(compLastThen_First);
        tm.put("Valera a", 25);
        tm.put("Lena b", 15);
        tm.put("Sasa c", 26);
        tm.put("Aretm a", 2);

        Set<Map.Entry<String, Integer>> set = tm.entrySet();
        for (Map.Entry me : set) {
            System.out.println(me.getKey() + " " + me.getValue());
        }


    }
}