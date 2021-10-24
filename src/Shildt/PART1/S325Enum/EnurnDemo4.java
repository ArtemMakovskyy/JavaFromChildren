package Shildt.PART1.S325Enum;
/////////////////////////////////////////порядковы   сравнить с
//Продемонстрировать применение методов ordinal() , соmраrеТо() и equals ()

public class EnurnDemo4 {
    public static void main(String[] args) {
        Apple a1, a2, a3, a4;
//        получить все порядковые значения с  помощью  метода ordinal()
        for (Apple a :
                Apple.values()) {
            System.out.println(a.ordinal());
        }
        a1 = Apple.Jonathan;
        a2 = Apple.GoldenDel;
        a3 = Apple.RedDel;
        a4 = Apple.Winesap;
        System.out.println();
//            продемонстрировать применение методов сошраrеТо() и equals ()
        if (a1.compareTo(a2) < 0) System.out.println(a1 + " предшетвует " + a2);
        if (a1.compareTo(a2) > 0) System.out.println(a2 + " предшествует  " + a1);
        if (a1.compareTo(a3) == 0) System.out.println(a1 + "равно  " + a3);
        System.out.println();
        if (a1.equals(a2)) System.out.println(" Oшибкa! ");
        if (a1.equals(a3)) System.out.println(a1 + " равно  " + a3);
        if (a1 == a3) System.out.println(a1 + " == "+ a3);


    }
}
