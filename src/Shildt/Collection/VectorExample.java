package Shildt.Collection;
//https://www.youtube.com/watch?v=XpGR6zEhhSc&list=PLqj7-hRTFl_oDMBjI_EstsFcDAwt-Arhs&index=11
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Zaur");
        vector.add("Misha");
        vector.add("Oleg");
        vector.add("Katya");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));


    }
}
