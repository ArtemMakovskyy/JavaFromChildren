package Shildt.Reflaction;

public class ClassSpecial {
    public static void main(String[] args) {
        Object d;
        Object o = new String("A");
        d=o.equals(o);
        System.out.println(d);
        d=o.hashCode();
        System.out.println(d);
        d = o.toString();
        System.out.println(d);
        d = o.getClass();
        System.out.println(d);

        // можем привоитб значения двумя путями
        Class clazz = Double.class;
        Class clazz2 = o.getClass();


    }
}
