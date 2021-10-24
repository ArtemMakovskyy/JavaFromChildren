package Shildt.StringText488;

public class equalsDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "By";
        String s4 = "HELLO";
        String s5 = "HELLO HELLO";

        System.out.println(s1+ " equal "+ s2 + " -> "+ s1.equals(s2));
        System.out.println(s1+ " equal "+ s3 + " -> "+ s1.equals(s3));
        System.out.println(s1+ " equal "+ s4 + " -> "+ s1.equals(s4));
        System.out.println(s1+ " равно беэ учета регистра  "+ s4 + " -> "+ s1.equalsIgnoreCase(s4));
        System.out.println();

        System.out.println(s1.regionMatches(0,s2,0,5));  // p 478
        System.out.println(s5.regionMatches(6,s4,0,5));
        System.out.println(s5.regionMatches(true,6,s1,0,5));
        System.out.println(s5.regionMatches(false,6,s1,0,5));



//        boolean игнорировать _регистр
//        (начальный индекс ,
//        String,
//        int начало строки
//        длина сравниваемой подстроки



        String st = "h Hello";
        System.out.println(st);
        System.out.println(st.regionMatches(true,2,s5,6,5));

String foobar = "Foobar";
        boolean b =  "Foobar".endsWith("bar");
        boolean b2 =  "Foobar".startsWith("bar",3);
        System.out.println();
        System.out.print("Foobar".endsWith("bar")+", ");
        System.out.print(foobar.endsWith("ba")+", ");
        System.out.println(foobar.startsWith("Fo"));





    }
}
